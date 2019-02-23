package com.pollka.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Answer {
    private int id;
    @NotNull
    @NotEmpty
    private String name;

    public Answer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return getId() == answer.getId() &&
                getName().equals(answer.getName());
    }

    @Override
    public int hashCode() {
        return id;
    }
}
