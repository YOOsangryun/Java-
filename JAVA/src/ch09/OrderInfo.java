package ch09;

public class OrderInfo {
    public static void main(String[] args) {

        Order ThomasOrder = new Order();
        ThomasOrder.orderNumber = "202011020003";
        ThomasOrder.orderPhoneNumber = "01023450001";
        ThomasOrder.orderHomeAddress = "서울시 강남구 역삼동 111-333";
        ThomasOrder.orderDate = "20201102";
        ThomasOrder.orderTime = "130258";
        ThomasOrder.orderPrice = "35000";
        ThomasOrder.orderMenuNumber = "0003";

        System.out.println(ThomasOrder.showOrderInfo());
    }
}
