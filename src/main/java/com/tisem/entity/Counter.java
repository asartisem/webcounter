package com.tisem.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "counter")
public class Counter implements Serializable {

    @Id
    private int id;

    private int value;

    public Counter(int id, int value) {
        this.id = id;
        this.value = value;
    }

    private Counter() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
