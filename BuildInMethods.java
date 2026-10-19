public class BuildInMethods {
    public static void main(String[] args) {

        /*
         * Math and System belong to java.lang.
         * No import statement is needed.
         */
        double employeeSalary = 25000.75;
        System.out.println("Employee Salary: " +employeeSalary);
        long roundedSalary = Math.round(employeeSalary);
        System.out.println("Rounded Salary: " + roundedSalary);

        System.out.println("Max 10, 20 : " + Math.max(10, 20));
        System.out.println("Min 10, 20 : " + Math.min(10, 20));
        System.out.println("Math sqrt 25 : " + Math.sqrt(25));
        System.out.println("Math absolute value (-35) : " + Math.abs(-35));
        System.out.println("Math power(2,3) : " + Math.pow(2, 3));
        System.out.println("Math Round upward (5.2) : " + Math.ceil(5.2));
        System.out.println("Math Round downward (5.2) : " + Math.floor(5.2));
        System.out.println("Random Number : " + Math.random());

        // Built-in String methods
        String employeeName = "John Hentry";
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Name Length : " + employeeName.length());

        // Change letter case
        System.out.println("Uppercase Name : " + employeeName.toUpperCase());
        System.out.println("Lowercase Name : " + employeeName.toLowerCase());

        // Get a character
        System.out.println("charAt(0) : " + employeeName.charAt(0));

        String language = "Java Programming Language";

        // Check whether text exists
        System.out.println("Programming Language : " + language);
        System.out.println("String contains-Java :" + language.contains("Java"));

        // Find the number of characters
        System.out.println("Length : " + language.length());

        // Extract part of a string
        String subString = language.substring(0, 4);
        System.out.println("substring : " + subString);

        // startsWith "java"
        System.out.println("Starts With 'Java' : " + language.startsWith("Java"));
        // endsWith language
        System.out.println("Ends With 'language' : " + language.endsWith("Language"));

        // Compare strings
        System.out.println("string equals(java) : " + subString.equals("java"));
        System.out.println("string equals(java) : " + subString.equalsIgnoreCase("java"));

        // trim
        String originalStr = "   Hello, World!   ";
        // Apply the trim() method
        String trimmedStr = originalStr.trim();
        // Output the results
        System.out.println("Original: '" + originalStr + "'");
        System.out.println("Trimmed : '" + trimmedStr + "'");


        // Concatenate strings
        System.out.println("concat : " + subString.concat("Programming"));

        // Replace text
        String message = "Hello Java";
        System.out.println("text : "+ message);
        System.out.println("Replaced Text : " + message.replace("Java", "World"));
    }
}
