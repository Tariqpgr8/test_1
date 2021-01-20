package org.tariq.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Department_Table")
public class Department extends PanacheEntity{
        @Column(table ="Department_Table",name = "Employee_Name")
        private long d_id;

        @Column(table ="Department_Table",name = "Employee_Name")
        private String d_name;


        @Column(table="Department_Table", name="Employee_Address")
        private String location;

        public Department(long d_id, String d_name, String location ) {
            this.d_id=d_id;
            this.d_name = d_name;
            this.location=location;
        }

        public Department() {

        }

    }
