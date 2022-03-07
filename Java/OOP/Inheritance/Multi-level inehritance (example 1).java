class Institute {
    String institute_name = "Institute of Engineering"; // just a random name
}

class Teacher extends Institute {
    String teacher_name = "James Gosling";
    String subject = "Java Programming";
}

class Student extends Teacher {
    String student_name = "Abdullah Al Naiem";

    void displayInfo() {
        System.out.println("Institute Name: " + institute_name);
        System.out.println("Teacher Name  : " + teacher_name);
        System.out.println("Student Name  : " + student_name);
        System.out.println("Class of      : " + subject);
    }
}

class multiLevelInheritance {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.displayInfo();
    }
}