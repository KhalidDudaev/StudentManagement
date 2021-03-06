package com.khalid.model;

public class Subject {
    
    private final String name;
    private final GradeLevel level;
    private final SubjectType type;
    
    /** 
     * @param name
     * @param level
     * @param type
     */
    public Subject(String name, GradeLevel level, SubjectType type) {
        this.name = name;
        this.level = level;
        this.type = type;
    }

    /** 
     * @return String
     */
    public String getName() {
        return this.name;
    }
    
    /** 
     * @return GradeLevel
     */
    public GradeLevel getLevel() {
        return this.level;
    }
    
    /** 
     * @return SubjectType
     */
    public SubjectType getType() {
        return this.type;
    }

    /** 
     * @param name
     * @return boolean
     */
    public boolean isName(String name){
        return this.name.equals(name);
    }

    /** 
     * @param level
     * @return boolean
     */
    public boolean isLevel(GradeLevel level){
        return this.level == level;
    }

    /** 
     * @param type
     * @return boolean
     */
    public boolean isType(SubjectType type){
        return this.type == type;
    }

    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            "}";
    }
    
}
