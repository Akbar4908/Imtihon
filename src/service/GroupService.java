package service;

import model.Center;
import model.Group;
import model.Student;

public class GroupService extends Student {
    Group[] guruhList=new Group[24];
    int index =0;

    public boolean add(Object object) {
        Group group = (Group) object;
        for (Group group1 : guruhList) {
            if(group1 != null){
                if(group1.getName().equals(group.getName())){
                    return false;
                }
            }
        }
        guruhList[index++] = group;
        return true;

    }
    private boolean addStudent (String name){
        for (Group group:guruhList) {
            if (group!=null){
              if (super.getName().equals(name)) {
                  return false;
                }
            }
        }
        return true;
    }
}
