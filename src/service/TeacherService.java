package service;

import model.Teacher;

import java.util.UUID;

public class TeacherService {

    public static UUID currentTeacherId;
    private Teacher[] teacherList=new Teacher[100];
    private int index = 0;

    public static boolean add(Object object) {
        Teacher teacher = (Teacher) object;
        for (Teacher teacher1 : teacherList)
            if (teacher1 != null) {
                if (teacher1.getId().equals(teacher.getId())) {
                    return false;
                }
            }
        teacherList[index++] = teacher;
        return true;
    }
    public Teacher login(String surname, String password){
        for (Teacher teacher:teacherList) {
            if(teacher != null){
                if(teacher.getSurname().equals(surname) && teacher.getPassword().equals(password)){
                    currentTeacherId = teacher.getId();
                    return teacher;
                }
            }
        }
        return null;
    }

}
