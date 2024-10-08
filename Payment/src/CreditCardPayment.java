//****************************************************//
//* Author:1717859                                    *//
//* Week:3                                            *//
//*                                                  *//
//* Description: This class implements the Payment    *//
//*              interface to handle credit card      *//
//*              transactions. It includes specific   *//
//*              implementations of the pay and       *//
//*              refund methods tailored for credit   *//
//*              card processing. The card number is  *//
//*              provided at instantiation and is     *//
//*              used in transaction processing.      *//
//*                                                  *//
//*              This class allows independent        *//
//*              handling of credit card payments     *//
//*              and refunds while adhering to the    *//
//*              common Payment interface, which      *//
//*              ensures consistent functionality     *//
//*              with other payment types like        *//
//*              PayPalPayment.                       *//
//*                                                  *//
//* Date: 08/10/2024                                  *//
//****************************************************//
public class CreditCardPayment implements Payment {
    private String cardNumber;

    // Constructor to initialize CreditCardPayment with card details
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Implementation of the pay method for credit card
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount + " for card number: " + cardNumber);
    }

    // Implementation of the refund method for credit card
    @Override
    public void refund(double amount) {
        System.out.println("Processing credit card refund of $" + amount + " for card number: " + cardNumber);
    }
}
