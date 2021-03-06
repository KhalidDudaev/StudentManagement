package com.khalid.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.khalid.lib.ItemList;

public class SClass {
    
    private final String name;
    private ItemList<GradeLevel> levels = new ItemList<>();

    public SClass(String name, ItemList<GradeLevel> levels) {
        this.levels.addAll(levels);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public List<GradeLevel> getGrades() {
        return this.levels;
    }

    public void addGrade(GradeLevel grade) {
        this.levels.add(grade);
    }

    public void removeGrade(GradeLevel grade) {
        this.levels.remove(grade);
    }

    public boolean isName(String name){
        return this.name.equals(name);
    }

    public boolean isGrade(GradeLevel grade){
        return this.levels.contains(grade);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", grades='" + getGrades() + "'" +
            "}";
    }

}
