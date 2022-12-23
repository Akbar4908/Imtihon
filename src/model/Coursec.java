package model;

public class Coursec {
    private String beginner;
    private String elemantry;
    private String intermatid;
    private String IELTS;

    public Coursec(String beginner, String elemantry, String intermatid, String IELTS) {
        this.beginner = beginner;
        this.elemantry = elemantry;
        this.intermatid = intermatid;
        this.IELTS = IELTS;
    }

    public String getBeginner() {
        return beginner;
    }

    public void setBeginner(String beginner) {
        this.beginner = beginner;
    }

    public String getElemantry() {
        return elemantry;
    }

    public void setElemantry(String elemantry) {
        this.elemantry = elemantry;
    }

    public String getIntermatid() {
        return intermatid;
    }

    public void setIntermatid(String intermatid) {
        this.intermatid = intermatid;
    }

    public String getIELTS() {
        return IELTS;
    }

    public void setIELTS(String IELTS) {
        this.IELTS = IELTS;
    }
    @Override
    public String toString() {
        return "Coursec{" +
                "beginner='" + beginner + '\'' +
                ", elemantry='" + elemantry + '\'' +
                ", intermatid='" + intermatid + '\'' +
                ", IELTS='" + IELTS + '\'' +
                '}';
    }
}
