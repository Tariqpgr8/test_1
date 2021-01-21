package org.tariq.resteasyjackson;

import org.tariq.entity.Department;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.stream.Collectors;

@Path("/Department/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class JacksonResource2 {

    private final Set<Department> quark = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
    public JacksonResource2() {
    }

    @GET
    @Transactional
    public Set<Department> list() {
        return Department.findAll().list().stream().map(x->(Department)x).collect(Collectors.toSet());
    }
@Transactional
    @POST
@Path("save")
    public Set<Department> add(Department quark) {
        quark.persistAndFlush();
        return list();
    }

    @DELETE
    @Transactional
    public Set<Department> delete(Department quark) {
        //Employee test= Employee.find(quark.).firstResult();
        //test.delete();
        return list();
        }
    }
