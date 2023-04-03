package com.akturk.flyway.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "username" , nullable = false)
    private String username;

    @Column(name = "firstname" , nullable = false)
    private String firstname;

    @Column(name = "lastname")
    private String lastname;
}
