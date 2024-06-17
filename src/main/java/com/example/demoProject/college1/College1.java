package com.example.demoProject.college1;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@jakarta.persistence.Entity
public class College1 {
    @Id
    private Integer id;

    private String cname;
    private String cadd;

    // Constructors, Getters, and Setters

    public College1() {}

    public College1(String cname, String cadd) {
        this.cname = cname;
        this.cadd = cadd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCadd() {
        return cadd;
    }

    public void setCadd(String cadd) {
        this.cadd = cadd;
    }
}
