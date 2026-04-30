package Example5.BetterCode;

public class VisaCreditCard extends CreditCard implements RefundCompatibleCreditCard{

    @Override
    public void swipeAndPay()
    {
        System.out.println("Visa Credit Card swipeAndPay");
    }

    @Override
    public void onlinePayment()
    {
        System.out.println("Visa Credit Card onlinePayment");
    }

    @Override
    public void tapAndPay()
    {
        System.out.println("Visa Credit Card tapAndPay");
    }

    @Override
    public void doRefund()
    {
        System.out.println("Visa Credit Card doRefund");
    }
}
