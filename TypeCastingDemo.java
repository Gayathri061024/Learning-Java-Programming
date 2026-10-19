public class TypeCastingDemo {

    
      /* The main() method is the entry point of the program.
      Execution starts here.
     */

    public static void main(String[] args) {
        
        /* Widening Casting (Implicit / Automatic)
        Direction: byte -> short -> char -> int -> long ->float -> double
        */

        int valueInt =  56;
        double valueDouble = valueInt; // No Explicit Type Casting Needed

        System.out.println(valueInt);
        System.out.println(valueDouble); 

        double num2 = 23.6;
        double sum = valueInt + num2; //int automatically converts to double

        System.out.println(sum);
        System.out.println(" sum of " +valueInt+ " and " +num2+ " is " +sum);

        /* Narrowing Casting (Explicit / Manual)
        Direction: double -> float -> long -> int -> char -> short -> byte
        */

        double employeeSalary = 25000.75;  
        int salaryValue = (int) employeeSalary;  // double manually converts to int

        System.out.println("Employee Salary: " + employeeSalary);
        System.out.println("Explicit Casting: " + salaryValue);

    }
}