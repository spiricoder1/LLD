package test.card;

public class myDebitcard extends mycard implements PaymentMethod{
    public myDebitcard(String cardNo, String userName){
        super(cardNo,userName);
    }
    @Override
    public void pay(){
        System.out.println("Making payment via debit card");
    }
}
