class Parent {
    void address() {
        System.out.println("I'm from Dhaka, Bangladesh");
    }
}
class Child extends Parent {
    void address() {
        System.out.println("I'm from Chittagong, Bangladesh");
    }
}
class runTime {
    public static void main(String[] args){
        Parent Pr = new Parent();
        Pr.address();
        
        Child Ch = new Child();
        Ch.address();
    }
}