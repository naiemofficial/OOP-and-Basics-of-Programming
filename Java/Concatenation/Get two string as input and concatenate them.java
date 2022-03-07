import java.util.Scanner; 
class stringInputConcatenate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String first_name = input.nextLine();
        System.out.print("Enter your last name: ");
        String last_name = input.nextLine();
        System.out.println("Your name is: " + first_name + last_name);
        
        /*
         * This print also can be done with this following way
         * ---------------------------------------------------
         * String result = first_name + last_name;
         * System.out.println( "Your name is: " + result );
         */
    }
}