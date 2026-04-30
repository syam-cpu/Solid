package Example5.ProblamaticCode;

public class MasterCardCreditCard  extends CreditCard {

    @Override
    public void swipeAndPay()
    {
        System.out.println("MasterCard credit card swipe and pay");
    }

    @Override
    public void doRefund()
    {
        System.out.println("MasterCard Credit card doRefund");
    }

    @Override
    public void onlinePayment()
    {
        System.out.println("MasterCard Credit card OnlinePayment");
    }

    @Override
    public void tapAndPay()
    {
        System.out.println("MasterCard credit card tapandpay");
    }

    @Override
    public void upiPayment()
    {
        System.out.println("MasterCard credit card upipayment");
    }
}
