class Teacher {
    String teacher_name = "James Gosling";
    String subject = "Java Programming";

    void teacherInfo() {
        System.out.println("Teacher info: \n--------------");
        System.out.println("Name   : " + teacher_name);
        System.out.println("Subject: " + subject);
    }
}

class Student extends Teacher {
    String student_name = "Abdullah Al Naiem";
    int id = 123456;

    void studentInfo() {
        System.out.println("\nStudent info: \n--------------");
        System.out.println("Name: " + student_name);
        System.out.println("ID  : " + id);
        System.out.println("Class of: " + subject);
    }
}

class singleInhertance {
    public static void main(String[] args) {
        Student get = new Student();
        get.teacherInfo();
        get.studentInfo();
    }
}