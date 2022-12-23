package service;

import model.Table;

public class TableService {
    public Table[] tableList=new Table[100];
    private int index=0;

    public boolean addCource (String curs, int attendance , String studentSurname){
        for (Table table:tableList) {
            if (table!= null){
                if (table.getCurs().equals(curs)){
                    return false;
                }
            }
        }
        return true;
    }
    public int count=0;
    private String Attendance(String attendance , String surname){
        for (Table table:tableList) {
            if (table!=null){
                if (table.getStudentSurname().equals(surname)&& count ==3){
                    return surname = null;
                }
                count++;
            }
        }
        return surname;
    }


}
