package com.khalid;

import com.khalid.model.SClass;
import com.khalid.lib.ItemList;
import com.khalid.model.Group;
import com.khalid.model.Student.*;

public class Manager {

    private ItemList<SClass>            classList   = new ItemList<>();
    private ItemList<Group>             groupList   = new ItemList<>();
    private ItemList<StudentRecord>     records     = new ItemList<>();

    public Manager() {}

    public Manager(ItemList<SClass> classList, ItemList<Group> groupList) {
        this.classList = classList;
        this.groupList = groupList;
    }
    
    public void addClass(SClass sclass){
        classList.add(sclass);
    }

    public void addGroup(Group group){
        groupList.add(group);
    }

    public ItemList<SClass> getClassList() {
        return this.classList;
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
            " classList='" + this.classList.toString() + "'" +
            ", groupList='" + this.groupList.toString() + "'" +
            "}";
    }


}
