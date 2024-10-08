//****************************************************//
//* Author:1717859                                    *//
//* Week:3                                            *//
//*                                                  *//
//* Description: This class implements the Payment    *//
//*              interface to handle transactions     *//
//*              via PayPal. It provides specific     *//
//*              implementations of the pay and       *//
//*              refund methods tailored for PayPal   *//
//*              payment processing. The email        *//
//*              address associated with the PayPal   *//
//*              account is provided at instantiation *//
//*              and is used in each transaction.     *//
//*                                                  *//
//*              By implementing the Payment          *//
//*              interface, this class ensures that   *//
//*              PayPal transactions are handled      *//
//*              consistently with other payment      *//
//*              types, such as CreditCardPayment,    *//
//*              while maintaining unique behaviors   *//
//*              relevant to PayPal processing.       *//
//*                                                  *//
//* Date: 08/10/2024                                  *//
//****************************************************//
public class PayPalPayment implements Payment {
    private String email;

    // Constructor to initialize PayPalPayment with email address
    public PayPalPayment(String email) {
        this.email = email;
    }

    // Implementation of the pay method for PayPal
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " for account: " + email);
    }

    // Implementation of the refund method for PayPal
    @Override
    public void refund(double amount) {
        System.out.println("Processing PayPal refund of $" + amount + " for account: " + email);
    }
}
