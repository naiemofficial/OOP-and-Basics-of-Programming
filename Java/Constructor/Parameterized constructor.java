class paramConstructor {
    paramConstructor(String name) {
        System.out.println("Your name is: " + name);
    }
}

class run_paramConstructor {
    public static void main(String[] args) {
        paramConstructor student = new paramConstructor("Abdullah Al Naiem");
    }
}