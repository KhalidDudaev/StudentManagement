package com.khalid;

import static org.junit.Assert.assertTrue;

import com.khalid.model.GradeLevel;
import com.khalid.model.Group;
import com.khalid.model.StudentRecord;
import com.khalid.model.SClass;
import com.khalid.model.Student;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    App app = new App();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        // assertTrue( true );

        app.manager().addClass(new SClass("4C"));

        // app.manager().addRecord(new StudentRecord(student, sclass, grade, subjects, groups));
        
        System.out.println(app.manager().toString());

    }
}
