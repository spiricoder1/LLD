package test.card;

public class myCreditCard extends mycard implements PaymentMethod{
    public myCreditCard(String cardNo, String userName){
        super(cardNo,userName);
    }
    @Override
    public void pay(){
        System.out.println("Making payment via credit card");
    }
}
