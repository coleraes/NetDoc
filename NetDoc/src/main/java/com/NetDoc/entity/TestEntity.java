package com.NetDoc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TestEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String text;

    protected TestEntity() {}

    public TestEntity(String text) {
        this.text = text;
    }

    public TestEntity(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format(
                "TestEntity[id=%d, text='%s']",
                id, text);
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}