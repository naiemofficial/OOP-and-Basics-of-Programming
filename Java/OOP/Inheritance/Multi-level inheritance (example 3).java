class Institute {
    private String institute_name = "Institute of Engineering"; // just a random name
    private int eiin = 654321;

    void instituteInfo() {
        System.out.println("Institute info: \n--------------");
        System.out.println("Name: " + institute_name);
        System.out.println("EIIN: " + eiin);
    }
}

class Teacher extends Institute {
    String teacher_name = "James Gosling";
    String subject = "Java Programming";

    void teacherInfo() {
        System.out.println("\nTeacher info: \n--------------");
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

class multiLevelInhertance {
    public static void main(String[] args) {
        Student get = new Student();
        get.instituteInfo();
        get.teacherInfo();
        get.studentInfo();
    }
}