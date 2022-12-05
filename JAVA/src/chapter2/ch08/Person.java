package chapter2.ch08;

public class Person {
    public String personName;
    public String personHeight;
    public String personWeight;
    public String personAge;
    public String personGender;

    public Person(){}

    public Person(String personHeight, String personWeight, String personGender, String personName, String personAge){
        this.personHeight = personHeight;
        this.personWeight = personWeight;
        this.personGender = personGender;
        this.personName = personName;
        this.personAge = personAge;
    }
    public String showPersonInfo() {return "키가" + personHeight + "이고" + "몸무게가" + personWeight + "킬로인" + personGender + "이 있습니다." + "이름은" + personName + "이고" + "나이는" + personAge + "세입니다.";}
}
