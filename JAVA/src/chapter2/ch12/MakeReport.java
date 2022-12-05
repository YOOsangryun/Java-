package chapter2.ch12;

public class MakeReport {
    StringBuffer buffer = new StringBuffer();

    private String line = "=============\n";
    private String title = " 이름\t 주소\t\t 전화번호 \n";
    private void makeHeader(){
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }
    private void generateBody(){
        buffer.append("James \t");
        buffer.append("Seoul Krea \t");
        buffer.append("010-2222-3333\n");

        buffer.append("Tomas \t");
        buffer.append("NewYork US \t");
        buffer.append("010-7777-0987 \n");

    }
    private void makeFooter(){
        buffer.append(line);
    }
    String getReport(){
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }
}