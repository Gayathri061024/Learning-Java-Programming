

// Classes - pascalCase (UpperCamelCase)
public class NamingConvention {

    public static void main(String[] args) {
       
        //Grocery Bill calculator

       /* Declare and initialize variables 
        camelCase (LowerCamelCase) 
        */

        double itemPrice = 100.0;
        int itemQuantity = 3;
         

        /* Declare a constant using final
        constants - UPPER_SNAKE_CASE 
        */

        final double GST_RATE = 5.0;

        // camelCase: variables used for calculations
        double totalPrice = itemPrice * itemQuantity;
        double gstAmount = totalPrice * GST_RATE / 100;
        double finalBill = totalPrice + gstAmount;

        System.out.println("Total Price: " + totalPrice);
        System.out.println("GST Amount: " + gstAmount);
        System.out.println("Final Bill: " + finalBill);
    }
}