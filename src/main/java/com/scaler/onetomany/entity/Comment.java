package com.scaler.onetomany.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "text")
    private String text;

    public Comment() {
    }

    public Comment(String text) {
        this.text = text;
    }
}
