package org.tariq.resteasyjackson;

import org.tariq.entity.Employee;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.stream.Collectors;

@Path("/Employee/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class JacksonResource {

    private final Set<Employee> quark = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
    public JacksonResource() {
    }

    @GET
    @Transactional
    public Set<Employee> list() {
        return Employee.findAll().list().stream().map(x->(Employee)x).collect(Collectors.toSet());
    }
@Transactional
    @POST
@Path("save")
    public Set<Employee> add(Employee quark) {
        quark.persistAndFlush();
        return list();
    }

    @DELETE
    @Transactional
    public Set<Employee> delete(Employee quark) {
        //Employee test= Employee.find(quark.).firstResult();
        //test.delete();
        return list();
        }
    }
