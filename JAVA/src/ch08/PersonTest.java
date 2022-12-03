package ch08;

public class PersonTest {
    public static void main(String[] args) {

        Person PersonTomas = new Person();
        PersonTomas.personName = "Tomas";
        PersonTomas.personAge = "37";
        PersonTomas.personGender = "남성";
        PersonTomas.personWeight = "78";
        PersonTomas.personHeight = "180";

        System.out.println(PersonTomas.showPersonInfo());

    }
}
