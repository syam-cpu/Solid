package Example5.ProblamaticCode;

public class RupayCreditCard  extends CreditCard {

    @Override
    public void swipeAndPay()
    {
        System.out.println("Rupay Credit Card swipe and pay");
    }

    @Override
    public void doRefund()
    {
        System.out.println("Rupay Credit Card doRefund");
    }

    @Override
    public void onlinePayment()
    {
        System.out.println("Rupay Credit Card onlinePayment");
    }

    @Override
    public void tapAndPay()
    {
        System.out.println("Rupay Credit Card tapandPay");
    }

    @Override
    public void upiPayment()
    {
        System.out.println("Rupay Credit Card upiPayment");
    }
}
