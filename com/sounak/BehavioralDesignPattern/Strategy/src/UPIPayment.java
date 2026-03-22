public class UPIPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via UPI");
    }
}
