package com.khalid.model.Student;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Student {

    // students firstName and secondmane
    private String  firstName;
    private String  secondName;
    private long    birthDay;

    public Student() { }

    /** 
     * @param name
     * @param birthDay
     */
    public Student(String name, String birthDay) {
        String[] names      = name.split("\s+");
        this.firstName      = names[0];
        this.secondName     = names[1];

        try {
            DateFormat dateformat = new SimpleDateFormat("yyyy MM dd");
            this.birthDay = dateformat.parse(birthDay).getTime();
        } catch (ParseException  pe) {
            pe.printStackTrace();
        }
    }

    /** 
     * @return String
     */
    public String getName() {
        return this.firstName;
    }

    
    /** 
     * @param firstName
     */
    public void setName(String firstName) {
        this.firstName = firstName;
    }

    
    /** 
     * @return String
     */
    public String getSecondName() {
        return this.secondName;
    }

    
    /** 
     * @param secondName
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public long getBirthDay() {
        return birthDay;
    }

    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " firstName='" + getName() + "'" +
            ", secondName='" + getSecondName() + "'" +
            ", birthDay='" + getBirthDay() + "'" +
            // ", withoutPlaces='" + getWithoutPlaces() + "'" +
            "}";
    }
    
}
