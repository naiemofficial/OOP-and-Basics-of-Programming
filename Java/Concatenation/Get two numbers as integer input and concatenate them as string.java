import java.util.Scanner; 
class numberInputConcatenate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("The result is = " + num1 + num2);

        /*
         * This print also can be done with this following way
         * ---------------------------------------------------
         * String result = "" +num1 + num2;
         * System.out.println( "The result is = " + result );
         */
    }
}