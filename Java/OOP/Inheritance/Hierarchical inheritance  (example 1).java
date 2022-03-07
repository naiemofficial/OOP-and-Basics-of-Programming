class Institute {
    String institute_name = "Institute of Engineering"; // just a random name
}

class Teacher extends Institute {
    String teacher_name = "James Gosling";

    void info() {
        System.out.println(teacher_name + " works as a teacher at " + institute_name);
    }
}

class Student extends Institute {
    String student_name = "Abdullah Al Naiem";

    void info() {
        System.out.println(student_name + " studying at " + institute_name);
    }
}

class hierarchicalInhertance {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.info();
        Student student = new Student();
        student.info();
    }
}