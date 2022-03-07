class constructor {
    constructor(String department) {
        System.out.println("Dept of. " + department);
    }

    constructor(String name, int id) {
        System.out.println("Sudent Name: " + name);
        System.out.println("ID: " + id);
    }
}

class run_constructor {
    public static void main(String[] args) {
        constructor department = new constructor("Computer Engineering");
        constructor student = new constructor("Abdullah Al Naiem", 123456);
    }
}