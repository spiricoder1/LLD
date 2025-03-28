package test.card;

//package java;

abstract public class mycard implements PaymentMethod{
    protected static String cardNo;
    protected String userName;
    public mycard(String cardNo,String userName){
        this.cardNo = cardNo;
        this.userName = userName;
    }
    public static String getCardNo(){
        return cardNo;
    }
    public String getUserName(){
        return userName;
    }
//     public void pay(){
//         // i don't know which type of card it is using so
//         //instead of implementing it here we will implement it
//         // in child class and declare it as abstract and call it here.
//    }
    abstract public void pay();
}


