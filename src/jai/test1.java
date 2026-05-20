package jai;

public class test1 {
    public static void main(String[] args) {
        Exam exam1 = new Exam(1,"01.01.2021",10);
        Exam exam2 = new Exam(1,"01.01.2021",10);



        System.out.println(exam1.equals(exam2));

    }
}
class Exam {
    long id;
    String date;
    int mark;

    public Exam(long id, String date, int mark) {
        this.id = id;
        this.date = date;
        this.mark = mark;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null && getClass() != obj.getClass()) return false;
        Exam current = (Exam) obj;
        return current.id == id && current.date.equals(date) && current.mark == mark;
    }
}
