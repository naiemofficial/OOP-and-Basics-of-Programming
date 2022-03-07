class Teacher {
    String teacher_name = "James Gosling";
    String subject = "Java Programming";
}

class Student extends Teacher {
    String student_name = "Abdullah Al Naiem";
    int id = 123456;

    void displayInfo() {
        System.out.println("Teacher Name: " + teacher_name);
        System.out.println("Student Name: " + student_name);
        System.out.println("Student ID  : " + id);
        System.out.println("Class of    : " + subject);
    }
}

class singleInhertance {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.displayInfo();
    }
}