import java.util.Scanner;
class arithmeticOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("('+'=addition), ('-'=addition), ('x'or'*'=multiplication), ('/'=division), ('%'=modulus)");
        System.out.print("Select the operation: ");
        char operation = input.next().charAt(0);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int sum = 0; boolean flag = true;

        if (operation == '+') {
            sum = num1 + num2;
        } else if (operation == '-') {
            sum = num1 - num2;
        } else if (operation == 'X' || operation == 'x' || operation == '*') {
            sum = num1 * num2;
        } else if (operation == '/') {
            sum = num1 / num2;
        } else if (operation == '%') {
            sum = num1 % num2;
        } else {
            flag = false;
        }

        if (flag == true) {
            System.out.println("The result is = " + sum);
        } else {
            System.out.println("Error! Invalid operation");
        }
    }
}