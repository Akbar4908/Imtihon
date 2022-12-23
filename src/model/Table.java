package model;

public class Table {
    private String curs;
    private int attendance;
    private String studentName;
    private String studentSurname;

    public Table(String curs, int davomat, String studentName, String studentSurname) {
        this.curs = curs;
        this.attendance = davomat;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public int getDavomat() {
        return attendance;
    }

    public void setDavomat(int davomat) {
        this.attendance = davomat;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    @Override
    public String toString() {
        return "Table{" +
                "curs='" + curs + '\'' +
                ", davomat=" + attendance +
                ", studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                '}';
    }
}
