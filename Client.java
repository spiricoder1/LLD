package test.card;

public class Client {
    public static void main(String[] args){
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("Mitali",new myDebitcard("123","Mitali"));
        ps.addPaymentMethod("Viral",new myCreditCard("234","gdfds"));
        ps.makePayment("Mitali");
        ps.makePayment("Viral");
    }
}
