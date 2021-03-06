package com.khalid.init;

import com.khalid.model.SClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.khalid.lib.ItemList;
import com.khalid.model.GradeLevel;
import com.khalid.model.Student.Student;

public class ClassInit {
    
    String[] classChar = "A B C D E F G".split("\s+");

    private ItemList<SClass> classList       = new ItemList<>();

    public ClassInit() {
    }

    public ItemList<SClass> initList(ItemList<Student> students) {
        ItemList<SClass> classes        = new ItemList<>();
        ItemList<GradeLevel> levels     = new ItemList<>();
        ItemList<ItemList<Student>> studGrade = new ItemList<>();
        // Map<String, ItemList<Student>> studGrade = new HashMap<>();
        // ItemList[] studGrade = {};

        studGrade.add(0, null);

        for (int i=1; i<=9; i++){
            studGrade.add(i, new ItemList<>());
        }

        for (Student student :students) {
            int level = (int) (student.getBirthDateYear() - 2005);
            // System.out.println("### " + level);
            levels.add(GradeLevel.valueOf("L"+level));
            // studGrade.put(""+level, new ItemList<>());
            studGrade.get(level).add(student);

        }
        
        // for (ItemList<Student> studClass : studGrade) {
        for (int level = 1; level <= 9; level ++) {
            ItemList<Student> studClass = studGrade.get(level);
            // classes.add(level, new SClass( level + "A", levels));
            // if(studGrade.get(i) != null){
                // System.out.println(studClass.size());

            int count = studClass.size();
            int max = 15;
            int divider = count / max + 1;
            int current = count / divider;
            int res = current * divider;
            int reminder = count - res;
            
            List<Integer> items = new ArrayList<>();
            
            for (int i = 1; i <= divider; i++){
                items.add(current);
            }

            while(reminder > 0) {
                for (int i = 1; i <= divider; i++){
                    if(reminder > 0) {
                        items.set(i-1, items.get(i) + 1 );
                    }
                    reminder--;
                }
            }
        }

        return classes;
    }
    
}
