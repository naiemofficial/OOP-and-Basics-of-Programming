class Institute {
    protected String institute_name = "Institute of Engineering"; // just a random name
    protected int teacher_salary = 45000;
    protected int tution_fee = 25000;
}

class Teacher extends Institute {
    String teacher_name = "James Gosling";

    void info() {
        System.out.println(teacher_name + " works as a teacher at " + institute_name);
        System.out.println("Salary per month: " + teacher_salary);
    }
}

class Student extends Institute {
    String student_name = "Abdullah Al Naiem";

    void info() {
        System.out.println(student_name + " studying at " + institute_name);
        System.out.println("Tution fee per semester: " + tution_fee);
    }
}

class hierarchicalInhertance {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.info();
        System.out.println();
        Student student = new Student();
        student.info();
    }
}