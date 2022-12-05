package chapter2.ch12;

public class MakeReportTest {
    public static void main(String[] args) {
        MakeReport bulider = new MakeReport();
        String report = bulider.getReport();

        System.out.println(report);
    }
}
