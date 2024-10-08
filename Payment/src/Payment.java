//****************************************************//
//* Author:1717859                                    *//
//* Week:3                                            *//
//*                                                  *//
//* Description: This interface defines a contract    *//
//*              for a payment processing system. It  *//
//*              specifies two essential methods:     *//
//*              pay and refund. Any class            *//
//*              implementing this interface must     *//
//*              provide its own implementations for  *//
//*              processing payments and refunds.     *//
//*                                                  *//
//*              This interface is utilized by        *//
//*              multiple classes such as             *//
//*              CreditCardPayment and PayPalPayment, *//
//*              which adhere to this contract while  *//
//*              handling payments and refunds        *//
//*              according to their own specific      *//
//*              requirements.                        *//
//*                                                  *//
//* Date: 08/10/2024                                  *//
//****************************************************//
public interface Payment {
    // Method to process payment
    void pay(double amount);

    // Method to process refund
    void refund(double amount);
}
