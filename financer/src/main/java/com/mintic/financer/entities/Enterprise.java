package com.mintic.financer.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name="enterprise")
public class Enterprise {
    @Id
    private long id;
    private String name;
    private String document;
    private String phone;
    private String address;
    //private List<Employee> users = new java.util.ArrayList<>();
    //private List<Transaction> transactions;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
