import model.Student;
import model.Teacher;
import service.*;

import java.util.Scanner;

import java.util.Scanner;
import java.util.UUID;

        public class Main {
            public static void main(String[] args) {
                Scanner scannerStr = new Scanner(System.in);
                Scanner scannerInt = new Scanner(System.in);
                CenterService centerService = new CenterService();
                StudentService studentService = new StudentService();
                TeacherService teacherService = new TeacherService();
                GroupService groupService = new GroupService();
                CoursecService coursecService = new CoursecService();
                TableService tableService = new TableService();
                int stepCode = 100;
                while (stepCode != 0) {
                    System.out.println("1. Add User, 2. Login");
                    stepCode = scannerInt.nextInt();
                    switch (stepCode) {
                        case 1 -> {
                                System.out.println("1.Student , 2.Teacher");
                                switch (stepCode){
                                    case 1-> {
                                        System.out.println("Enter  Name:");
                                        String name = scannerStr.nextLine();
                                        System.out.println("Enter Surname");
                                        String surname = scannerStr.nextLine();
                                        System.out.println("Enter password");
                                        String password = scannerStr.nextLine();
                                        Student student = new Student(name, surname, password);
                                        System.out.println(studentService.add(student));
                                    }
                                    case 2-> {
                                        System.out.println("Enter  Name:");
                                        String name = scannerStr.nextLine();
                                        System.out.println("Enter Surname");
                                        String surname = scannerStr.nextLine();
                                        System.out.println("Enter experiance");
                                        String experiance=scannerStr.nextLine();
                                        System.out.println("Enter password");
                                        String password = scannerStr.nextLine();
                                        Teacher teacher = new Teacher(name, surname, password,experiance);
                                        System.out.println(TeacherService.add(teacher));
                                    }
                                }
                        }
                        case 2 -> {
                            System.out.println("1.Student , 2.Teacher");
                            switch (stepCode){
                                case 1->{
                                    System.out.println("Enter  Name:");
                                    String Name = scannerStr.nextLine();
                                    System.out.println("Enter password");
                                    String password = scannerStr.nextLine();
                                    Student currentStudent = studentService.login(Name, password);
                                    if(currentStudent == null){
                                        System.out.println("Wrong password or username");
                                    }else{
                                        int stepCode2 = 100;
                                        while(stepCode2 != 0){
                                            System.out.println("1.Center , 2.Cource , 3. Group,");
                                            stepCode2 = scannerInt.nextInt();
                                            switch (stepCode2){
                                                case 1->{

                                                }
                                            }
                                }
                            }
                                }

                            case 2-> {
                                System.out.println("Enter  Name:");
                                String Name = scannerStr.nextLine();
                                System.out.println("Enter password");
                                String password = scannerStr.nextLine();
                                Teacher current = teacherService.login(Name, password);
                            if(current == null){
                                System.out.println("Wrong password or username");
                            }else{
                                int stepCode2 = 100;
                                while(stepCode2 != 0){

                        }}
                    }
                }
            }
        }
                }
            }
        }

