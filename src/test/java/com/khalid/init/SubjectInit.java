package com.khalid.init;

import com.khalid.Manager;
import com.khalid.lib.ItemList;
import com.khalid.model.GradeLevel;
import com.khalid.model.Subject;
import com.khalid.model.SubjectType;

public class SubjectInit {

    String[] subjectlist_comm = {
        "COMMON Swedish",
        "COMMON English",
        "COMMON Physical Education",
        "COMMON Crafts",
        "COMMON Music",
        "COMMON Art",
        "COMMON Maths",
        "COMMON Technology",
        "COMMON Physics",
        "COMMON Chemistry",
        "COMMON Biology",
        "COMMON Story",
        "COMMON Social Science",
        "COMMON Geography",
        "COMMON Religion",
        "COMMON Home Economics",
    };
    String[] subjectlist_ind = {
        "INDIVIDUAL Spanish",
        "INDIVIDUAL French",
        "INDIVIDUAL German",
    };

    Manager manager = new Manager();
    ItemList<ItemList<Subject>> subjects = new ItemList<>();

    public SubjectInit (){
    }
    
    public ItemList<ItemList<Subject>> initList() {
        for (String subject :subjectlist_comm) {
            String[] part = subject.split("\s");
            
            manager.getSubjectList().add(null);

            for(int level = 1; level <= 9; level++){
                manager.getSubjectList().add(level, new ItemList<Subject>());
                // manager.add(i, new ItemList<>());
            }

            for(int level = 1; level <= 9; level++){
                // System.out.println("### " + i + " :" + part[1]);
                // manager.addSubject(new Subject(part[1], GradeLevel.valueOf("L" + level), SubjectType.valueOf(part[0])));
                // if(manager.getSubjectList().get(level) == null) manager.getSubjectList().add(level, new ItemList<Subject>());
                // if(manager.getSubjectList() == null)
                //     manager.getSubjectList().add(level, new ItemList<Subject>());
                manager.getSubjectList().get(level).add(new Subject(part[1], GradeLevel.valueOf("L" + level), SubjectType.valueOf(part[0])));
            }
        }
        for (String subject :subjectlist_ind) {
            String[] part = subject.split("\s");

            for(int level = 1; level <= 9; level++){
                // manager.getSubjectList().add(level, new ItemList<Subject>());
                // manager.add(i, new ItemList<>());
            }

            for(int level = 6; level <= 9; level++){
                // System.out.println("### " + i + " :" + part[1]);
                // manager.addSubject(new Subject(part[1], GradeLevel.valueOf("L" + level), SubjectType.valueOf(part[0])));
                // if(manager.getSubjectList().get(level) == null) manager.getSubjectList().add(level, new ItemList<Subject>());
                // manager.getSubjectList().get(level).add(new Subject(part[1], GradeLevel.valueOf("L" + level), SubjectType.valueOf(part[0])));
                manager.getSubjectList().get(level).add(new Subject(part[1], GradeLevel.valueOf("L" + level), SubjectType.valueOf(part[0])));
            }
        }
        return manager.getSubjectList();
    }

}

