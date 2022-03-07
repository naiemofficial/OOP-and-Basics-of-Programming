class Institute {
    private String institute_name = "Institute of Engineering"; // just a random name
    private int eiin = 654321;

    void instituteInfo() {
        System.out.println("Institute Name: " + institute_name);
        System.out.println("Institute EIIN: " + eiin);
    }
}

class Teacher extends Institute {
    String teacher_name = "James Gosling";
    String subject = "Java Programming";

    void teacherInfo() {
        System.out.println("Teacher Name  : " + teacher_name);
    }
}

class Student extends Teacher {
    String student_name = "Abdullah Al Naiem";
    int id = 123456;

    void studentInfo() {
        System.out.println("Student Name  : " + student_name);
        System.out.println("Student ID    : " + id);
        System.out.println("Class of      : " + subject);
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