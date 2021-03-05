package com.khalid.model;

import java.util.List;

public class Group {
    
    private final String name;
    private final int min;
    private final int max;
    private final int level;

    private List<Subject> subjects;


    public Group(String name, int min, int max, int level) {
        this.name = name;
        this.min = min;
        this.max = max;
        this.level = level;
    }


    public String getName() {
        return this.name;
    }

    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }

    public List<Subject> getSubjects() {
        return this.subjects;
    }

    public void addSubjects(Subject subject) {
        if(subject.level)
        this.subjects = subjects;
    }

    // public boolean isSubject(String subjectName) {
    //     for (Subject subject : subjects) {
    //         if (subject.getName().equals(subjectName)) return true;
    //     }
    //     return false;
    // }

    public boolean isSubject(Subject subject) {
        return this.subjects.contains(subject);
    }



    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", min='" + getMin() + "'" +
            ", max='" + getMax() + "'" +
            ", subjects='" + getSubjects() + "'" +
            "}";
    }


}
