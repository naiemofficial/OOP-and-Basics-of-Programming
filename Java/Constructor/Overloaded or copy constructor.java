class copyConstructor {
    copyConstructor(String department) {
        System.out.println("Dept of. " + department);
    }

    copyConstructor(String name, int id) {
        System.out.println("Student Name: " + name);
        System.out.println("ID: " + id);
    }
}

class run_copyConstructor {
    public static void main(String[] args) {
        copyConstructor department = new copyConstructor("Computer Engineering");
        copyConstructor student = new copyConstructor("Abdullah Al Naiem", 123456);
    }
}