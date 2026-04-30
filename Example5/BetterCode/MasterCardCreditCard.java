package Example5.BetterCode;

public class MasterCardCreditCard  extends CreditCard implements RefundCompatibleCreditCard {

    @Override
    public void swipeAndPay()
    {
        System.out.println("MasterCard credit card swipe and pay");
    }

    @Override
    public void onlinePayment()
    {
        System.out.println("MasterCard credit card onlinePayment");
    }

    @Override
    public void tapAndPay()
    {
        System.out.println("MasterCard credit card tapAndPay");
    }

    @Override
    public void doRefund()
    {
        System.out.println("MasterCard credit card doRefund");
    }
}
