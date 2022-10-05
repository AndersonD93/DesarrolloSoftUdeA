package com.mintic.financer.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name="profile")
public class Profile {

    @Id
    @Column(name = "id_profile")
    private long id;
    private String image;
    private String phone;
    //private Employee user;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

}
