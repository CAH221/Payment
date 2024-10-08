//****************************************************//
//* Author:1717859                                    *//
//* Week:3                                            *//
//*                                                  *//
//* Description: This class demonstrates a simple     *//
//*              payment processing system that       *//
//*              utilizes abstraction through         *//
//*              interfaces. It includes two payment  *//
//*              methods: CreditCardPayment and       *//
//*              PayPalPayment. Each method can       *//
//*              process payments and refunds         *//
//*              independently while adhering to a    *//
//*              common Payment interface.            *//
//*                                                  *//
//* Date: 08/10/2024                                  *//
//****************************************************//
public class Main {
    public static void main(String[] args) {
        // Create a CreditCardPayment object
        Payment creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
        creditCardPayment.pay(100.00);    // Process payment using credit card
        creditCardPayment.refund(50.00);  // Process refund using credit card
        System.out.println();

        // Create a PayPalPayment object
        Payment payPalPayment = new PayPalPayment("chill@example.com");
        payPalPayment.pay(200.00);        // Process payment using PayPal
        payPalPayment.refund(75.00);      // Process refund using PayPal
    }
}
