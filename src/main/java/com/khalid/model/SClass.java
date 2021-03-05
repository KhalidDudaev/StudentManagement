package com.khalid.model;

import java.util.ArrayList;
import java.util.List;

public class SClass {
    
    private final String name;
    private List<GradeLevel> grades = new ArrayList<>();

    public SClass(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public List<GradeLevel> getGrades() {
        return this.grades;
    }

    public void addGrade(GradeLevel grade) {
        this.grades.add(grade);
    }

    public void removeGrade(GradeLevel grade) {
        this.grades.remove(grade);
    }

    public boolean isName(String name){
        return this.name.equals(name);
    }

    public boolean isGrade(GradeLevel grade){
        return this.grades.contains(grade);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", grades='" + getGrades() + "'" +
            "}";
    }

}
