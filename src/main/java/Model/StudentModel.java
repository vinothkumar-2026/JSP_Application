package Model;

public class StudentModel {
    private int ecno;
    private String studentname;
    private String studentfeedback;

    public int getEcno() {
        return ecno;
    }

    public void setEcno(int ecno) {
        this.ecno = ecno;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentfeedback() {
        return studentfeedback;
    }

    public void setStudentfeedback(String studentfeedback) {
        this.studentfeedback = studentfeedback;
    }

    public StudentModel(int ecno, String studentname, String studentfeedback) {
        this.ecno = ecno;
        this.studentname = studentname;
        this.studentfeedback = studentfeedback;
    }

    public StudentModel() {
    }
}