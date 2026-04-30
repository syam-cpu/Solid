package Example5.ProblamaticCode;

public class VisaCreditCard extends CreditCard {

    
    @Override
    public void swipeAndPay()
    {
        System.out.println("Visa Credit Card swipeAndPay");
    }

    @Override
    public void doRefund()
    {
        System.out.println("Visa Credit Card doRefund");
    }

    @Override
    public void onlinePayment()
    {
        System.out.println( "Visa Credit Card online payment");
    }

    @Override
    public void tapAndPay()
    {
        System.out.println("Visa Credit Card tap and Pay");
    }

    @Override
    public void upiPayment()
    {
        System.out.println("Visa Credit Card upi Payment");
    }
}
