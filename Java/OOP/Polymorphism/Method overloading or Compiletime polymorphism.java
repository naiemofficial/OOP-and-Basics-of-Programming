class overloading {
    void sum(int num1, int num2){
        System.out.println("Sum of (addition) = "  + (num1 + num2));
    }
    void sum(int num1, double num2){
        System.out.println("Sum of (addition) = "  + (num1 + num2));
    }
    void sum(double num1, int num2){
        System.out.println("Sum of (multiplication) = "  + (num1 * num2));
    }
}
class compileTime {
    public static void main(String[] args) {
        overloading calculate = new overloading();
        calculate.sum(2, 3);
        calculate.sum(4, 5.6);
        calculate.sum(7.8, 9);
    }
}