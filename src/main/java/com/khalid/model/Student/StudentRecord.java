package com.khalid.model.Student;

import java.util.Date;
import java.util.List;

import com.khalid.SClass;
import com.khalid.model.GradeLevel;
import com.khalid.model.Group;
import com.khalid.model.Subject;

public class StudentRecord {

    private final Student   student;
    private SClass          sclass;
    private GradeLevel      level;
    private List<Subject>   subjects;
    private List<Group>     groups;
    private long            registerDate;
    
    /** 
     * @param student
     * @param sclass
     * @param level
     * @param subjects
     * @param groups
     */
    public StudentRecord(Student student, SClass sclass, GradeLevel level, List<Subject> subjects, List<Group> groups) {
        this.student        = student;
        this.sclass         = sclass;
        this.level          = level;
        this.subjects       = subjects;
        this.groups         = groups;
        this.registerDate   = new Date().getTime();
    }
    
    /** 
     * @return Student
     */
    public Student getStudent() {
        return this.student;
    }

    /** 
     * @return SClass
     */
    public SClass getSclass() {
        return this.sclass;
    }

    /** 
     * @param sclass
     */
    public void setSclass(SClass sclass) {
        this.sclass = sclass;
    }

    /** 
     * @return GradeLevel
     */
    public GradeLevel getlevel() {
        return this.level;
    }

    /** 
     * @param level
     */
    public void setlevel(GradeLevel level) {
        this.level = level;
    }

    /** 
     * @return List<Subject>
     */
    public List<Subject> getSubjects() {
        return this.subjects;
    }

    /** 
     * @param subjects
     */
    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    /** 
     * @return List<Group>
     */
    public List<Group> getGroups() {
        return this.groups;
    }

    /** 
     * @param groups
     */
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public long getRegisterDate() {
        return registerDate;
    }

    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " student='" + getStudent() + "'" +
            ", regdate='" + getRegisterDate() + "'" +
            ", sclass='" + getSclass() + "'" +
            ", level='" + getlevel() + "'" +
            ", subjects='" + getSubjects() + "'" +
            ", groups='" + getGroups() + "'" +
            "}";
    }
    

}
