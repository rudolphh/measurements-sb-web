package com.rudyah.demorestapi.models;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String username;
    public String email;
    public String password;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
