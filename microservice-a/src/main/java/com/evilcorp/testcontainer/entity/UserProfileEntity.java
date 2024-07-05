package com.evilcorp.testcontainer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "userprofile")
@Data
public class UserProfileEntity {
    @Id
    private int id;
    private String name;
    private String email;
    private String profilePicId;
}
