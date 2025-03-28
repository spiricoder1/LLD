package test.card;

public class UPI implements PaymentMethod{
    String upiID;
    UPI(String id){
        this.upiID = id;
    }
    @Override
    public void pay() {
        System.out.println("This method uses UPI"+upiID);
    }
}
