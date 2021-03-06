package com.khalid;

import static org.junit.Assert.assertTrue;

import java.util.List;

import com.khalid.init.ClassInit;
import com.khalid.init.StudentInit;
import com.khalid.init.SubjectInit;
import com.khalid.lib.ItemList;
// import com.khalid.model.GradeLevel;
// import com.khalid.model.Group;
// import com.khalid.model.Student.*;
import com.khalid.model.SClass;
import com.khalid.model.Subject;
import com.khalid.model.Student.Student;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    App app                         = new App();

    ItemList<ItemList<Subject>> subjList      = new SubjectInit().initList();
    ItemList<Student> studList      = new StudentInit().initList();
    // ItemList<SClass> classList      = new ItemList<>();
    // ItemList<SClass> classList      = new ClassInit().initList(studList);

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        // assertTrue( true );
        // ItemList<Student> students = app.manager().getStudentList();
        // classList = classInit.initList(students);

        
        app.manager().setSubjectList(subjList);
        app.manager().setStudentList(studList);
        app.manager().genereteClassList();



        // app.manager().addClass(new SClass("4C"));

        // app.manager().addRecord(new StudentRecord(student, sclass, grade, subjects, groups));
        
        // System.out.println(app.manager().toString());

    }
}
