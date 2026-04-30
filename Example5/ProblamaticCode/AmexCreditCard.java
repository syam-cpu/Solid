package Example5.ProblamaticCode;

public class AmexCreditCard  extends CreditCard {
    
    @Override
    public void swipeAndPay()
    {
        System.out.println("Amex Credit Card swipeAndPay");
    }
    @Override

    public void doRefund()
    {
        System.out.println("Amex CreditCard  do Refund");
    }

    @Override
    public void onlinePayment()
    {
        System.out.println("Amex CreditCard onlinePayment");
    }

    @Override
    public void tapAndPay()
    {
        System.out.println("Amex CreditCard tap and pay");
    }

    @Override
    public void upiPayment()
    {
        System.out.println("Amex Credit Card upiPayment");
    }
}
