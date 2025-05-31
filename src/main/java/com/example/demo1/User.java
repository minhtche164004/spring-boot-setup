package com.example.demo1;

import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users", schema = "webbanhang")
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Usersid", nullable = false)
    private Integer id;

    @Column(name = "fullname", nullable = false, length = 100)
    private String fullname;

    @Column(name = "username", nullable = false, length = 100)
    private String username;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Column(name = "isAdmin", nullable = false)
    private Byte isAdmin;

    @Column(name = "address", nullable = false, length = 200)
    private String address;

    @Column(name = "phonenumber", nullable = false, length = 45)
    private String phonenumber;

    @Column(name = "email", length = 100)
    private String email;

}