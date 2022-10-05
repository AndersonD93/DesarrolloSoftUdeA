package com.mintic.financer.entities;



import com.mintic.financer.entities.enums.Enum_RoleName;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "employee")
public class Employee  {


    @Id
    @Column(name = "id_employee")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="email")
    private String email;
    //private Profile profile;
    @Column(name="role")
    private String role;
   // private List<Transaction> transactions;
    @Column(name="dateupdate")
    private LocalDateTime updateAt;

    @Column(name = "datecreated")
    private LocalDateTime createdAt;
    //private Enterprise enterprise;


}