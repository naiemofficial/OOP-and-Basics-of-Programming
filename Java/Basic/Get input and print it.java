import java.util.Scanner;
class printInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = input.nextLine();
        System.out.println("Your name is " + name);
    }
}
