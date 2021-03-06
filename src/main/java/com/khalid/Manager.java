package com.khalid;

import com.khalid.model.SClass;
import com.khalid.model.Subject;

import java.util.ArrayList;
import java.util.List;

import com.khalid.lib.ItemList;
import com.khalid.model.GradeLevel;
import com.khalid.model.Group;
import com.khalid.model.Student.*;

public class Manager {

    private final int classCapasitorMin = 7;
    private final int classCapasitorMax = 15;
    private final String[] classChar = "A B C D E F G".split("\s+");

    private ItemList<Student>   studentList         = new ItemList<>();
    // private ItemList<Subject>   subjectList     = new ItemList<>();
    private ItemList<ItemList<Subject>>subjectList = new ItemList<>();
    private ItemList<SClass>    classList           = new ItemList<>();
    private ItemList<Group>     groupList           = new ItemList<>();

    private ItemList<StudentRecord> records         = new ItemList<>();

    public Manager() {}

    public Manager(ItemList<SClass> classList, ItemList<Group> groupList) {
        this.classList = classList;
        this.groupList = groupList;
    }

    public void genereteClassList() {
        // ItemList<SClass> classes        = new ItemList<>();
        ItemList<GradeLevel> levels     = new ItemList<>();
        ItemList<ItemList<Student>> studGrade = new ItemList<>();

        studGrade.add(0, null);

        for (int i=1; i<=9; i++){
            studGrade.add(i, new ItemList<>());
        }

        for (Student student :studentList) {
            int level = (int) (student.getBirthDateYear() - 2005);
            levels.add(GradeLevel.valueOf("L"+level));
            studGrade.get(level).add(student);
        }

        for (int level = 1; level <= 9; level ++) {
            ItemList<Student> studentsOfOneAge = studGrade.get(level);
            // ItemList<Subject> sbjectsOneLevel = subjectList.get(level);

            ItemList<GradeLevel> lev = new ItemList<>();
            lev.add(GradeLevel.valueOf("L"+level));

            int count       = studentsOfOneAge.size();
            int max         = classCapasitorMax;
            int divider     = count / max + 1;
            int current     = count / divider;
            int reminder    = count - current * divider;
            
            List<Integer> items = new ArrayList<>();
            
            for (int i = 1; i <= divider; i++){
                items.add(current);
            }

            while(reminder > 0) {
                for (int i = 1; i <= divider; i++){
                    if(reminder > 0) {
                        items.set(i-1, items.get(i) + 1 );
                        // records.add(new StudentRecord(studentsOfOneAge.get(i-1), new SClass( level + classChar[divider], lev), level, subjects, groups))
                    }
                    reminder--;
                }
            }


            System.out.println(items);
        }



        // return classes;
    }
    

    public void setStudentList(ItemList<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public ItemList<Student> getStudentList() {
        return this.studentList;
    }

    public void setSubjectList(ItemList<ItemList<Subject>> subjectList) {
        this.subjectList = subjectList;
    }

    public void addSubject(int level, Subject subject){
        subjectList.get(level).add(subject);
    }

    public ItemList<ItemList<Subject>> getSubjectList() {
        return this.subjectList;
    }

    public void setClassList(ItemList<SClass> sclass){
        this.classList = sclass;
    }

    public void addClass(SClass sclass){
        classList.add(sclass);
    }
    
    public ItemList<SClass> getClassList() {
        return this.classList;
    }

    public void addGroup(Group group){
        groupList.add(group);
    }

    public ItemList<Group> getGroupList() {
        return this.groupList;
    }

    public void addRecord(StudentRecord record){
        this.records.add(record);
    }

    public ItemList<StudentRecord> getRecords(){
        return this.records;
    }

    @Override
    public String toString() {
        return "{" +
            " students='" + this.studentList.toString() + "'" +
            " subjects='" + this.subjectList.toString() + "'" +
            " classes='" + this.classList.toString() + "'" +
            ", groups='" + this.groupList.toString() + "'" +
            "}";
    }


}
