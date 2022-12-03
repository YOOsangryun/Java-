package ch09;

public class Order {
    public String orderNumber;
    public String orderPhoneNumber;
    public String orderHomeAddress;
    public String orderDate;
    public String orderTime;
    public String orderPrice;
    public String orderMenuNumber;

    public Order(){}

    public Order(String orderNumber, String orderPhoneNumber, String orderHomeAddress, String orderDate, String orderTime, String orderPrice, String orderMenuNumber){
        this.orderNumber = orderNumber;
        this.orderPhoneNumber = orderPhoneNumber;
        this.orderHomeAddress = orderHomeAddress;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.orderMenuNumber = orderMenuNumber;
    }
    public String showOrderInfo() {return "주문 접수 번호" + ":" + orderNumber + "주문전화번호" + ":" + orderPhoneNumber;}
}

