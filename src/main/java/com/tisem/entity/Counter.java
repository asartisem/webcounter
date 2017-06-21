package com.tisem.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "counter")
public class Counter implements Serializable {

    @Id
    @NotNull
    @GeneratedValue
    private int id;

    @Column(name = "value")
    private int value;

    public Counter(int id, int value) {
        this.id = id;
        this.value = value;
    }

    public Counter() {

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
