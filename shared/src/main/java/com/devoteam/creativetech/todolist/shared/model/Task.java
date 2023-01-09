package com.devoteam.creativetech.todolist.shared.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class Task implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
