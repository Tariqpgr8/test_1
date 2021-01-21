package org.tariq.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;

@Entity
@Table(name="Employee_Table")
public class Employee extends PanacheEntity {

    @Column(table ="Employee_Table",name = "Employee_Name")
    public long e_id;

    @Column(table ="Employee_Table",name = "Employee_Name")
    public String e_name;

    @Column(table = "Employee_Table", name="Employee_Number")
   public String number;

    @Column(table="Employee_Table", name="Employee_Address")
    public String address;

    //@Column(table="Employee_Table", name="Department_ID")
    //public String d_id;

    public Employee(long e_id, String e_name, String c_number, String address) {
        this.e_id=e_id;
        this.e_name = e_name;
        this.number = c_number;
        this.address=address;
    }

    public Employee() {

    }

}
