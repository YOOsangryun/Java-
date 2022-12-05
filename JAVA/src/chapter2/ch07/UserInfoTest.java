package chapter2.ch07;

public class UserInfoTest {
    public static void main(String[] args) {

        UserInfo userLee = new UserInfo();
        userLee.userId = "a12345";
        userLee.userPassWord = "z1234";
        userLee.userName = "Lee";
        userLee.phoneNumber = "0103333333";
        userLee.userAddress = "Seoul, Korea";

        System.out.println(userLee.showUserInfo());

        UserInfo userKim = new UserInfo("b12345", "123132", "Kim");
        System.out.println(userKim.showUserInfo());

    }
}
