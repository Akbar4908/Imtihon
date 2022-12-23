package service;

import model.Student;

import java.util.UUID;

public class StudentService {
    public static UUID currentStudentId;
    private Student[] studentsList=new Student[100];
    private int index = 0;

    public boolean add(Object object) {
        Student student = (Student) object;
        for (Student student1 : studentsList) {
            if(student1 != null){
                if(student1.getId().equals(student.getId())){
                    return false;
                }
            }
        }
        studentsList[index++] = student;
        return true;
    }
    public Student login(String surname, String password){
        for (Student student:studentsList) {
            if(student != null){
                if(student.getSurname().equals(surname) && student.getPassword().equals(password)){
                    currentStudentId = student.getId();
                    return student;
                }
            }
        }
        return null;
    }


}
