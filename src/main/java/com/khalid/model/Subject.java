package com.khalid.model;

public class Subject {
    
    private final String name;
    private final int level;
    private final String 
    
    /** 
     * @param name
     * @param level
     */
    public Subject(String name, int level) {
        this.name = name;
        this.level = level;
    }

    
    /** 
     * @return int
     */
    public int getLevel() {
        return this.level;
    }

    /** 
     * @return String
     */
    public String getName() {
        return this.name;
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
    public boolean isLevel(int level){
        return this.level == level;
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
