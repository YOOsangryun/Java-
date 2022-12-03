package ch10;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentlee = new Student(100, "Lee");
        studentlee.setKoreaSubject("국어", 100);
        studentlee.setMathSubject("수학", 100);

        Student studentKim = new Student(200, "Lee");
        studentKim.setKoreaSubject("국어", 60);
        studentKim.setMathSubject("수학", 50);

        studentlee.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
