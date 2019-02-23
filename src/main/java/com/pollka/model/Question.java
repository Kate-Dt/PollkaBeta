package com.pollka.model;

import com.sun.istack.internal.NotNull;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import java.util.Date;

public class Question {

    private int id;
    @NotNull
    @NotEmpty
    private String name;
    @NotNull
    @Past
    private Date startDate;
    @NotNull
    private Date endDate;
    @NotNull
    @NotEmpty
    private String type;
    @NotNull
    @NotEmpty
    private String description;

    public Question(@NotNull @NotEmpty String name,
                    @NotNull Date startDate,
                    @NotNull Date endDate,
                    @NotNull @NotEmpty String type,
                    @NotNull @NotEmpty String description) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.description = description;
    }

    public Question(int id,
                    @NotNull @NotEmpty String name,
                    @NotNull Date startDate,
                    @NotNull Date endDate,
                    @NotNull @NotEmpty String type,
                    @NotNull @NotEmpty String description){
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.description = description;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return getId() == question.getId() &&
                getName().equals(question.getName()) &&
                getStartDate().equals(question.getStartDate()) &&
                getEndDate().equals(question.getEndDate()) &&
                getType().equals(question.getType()) &&
                getDescription().equals(question.getDescription());
    }

    @Override
    public int hashCode() {
        return id;
    }
}