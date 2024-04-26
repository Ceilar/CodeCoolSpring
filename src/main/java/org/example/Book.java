package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="BOOK")
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Book() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
