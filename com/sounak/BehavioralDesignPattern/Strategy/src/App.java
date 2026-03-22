public class App {
    public static void main(String[] args) {
        PaymentService service = new PaymentService(new UPIPayment());
        service.pay(500);  // Paying 500 via UPI

        service.setStrategy(new CreditCardPayment());
        service.pay(1000); // Paying 1000 via Credit Card
    }
}