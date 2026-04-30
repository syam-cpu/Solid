package Example5.ProblamaticCode;

public class DinersCreditCard extends  CreditCard {

    @Override
    public void swipeAndPay()
    {
        System.out.println("Diners Credit Card swipeAndPay");
    }
    
    @Override
    public void doRefund()
    {
        System.out.println("Diners Credit Card doRefund");
    }

    @Override
    public void onlinePayment()
    {
        System.out.println("Diners Credit Card online Payment");
    }

    @Override
    public void tapAndPay()
    {
        System.out.println("Diners Credit Card tapAndPay");
    }

    @Override
    public void upiPayment()
    {
        System.out.println("Diners Credit Card upiPayment");
    }
}
