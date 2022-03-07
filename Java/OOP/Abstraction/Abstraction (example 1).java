abstract class Student {
    abstract void studentInfo();
    void academicInfo(){
        System.out.println("Dept. of Computer");
    }
}
class Naiem extends Student {
    @Override // annotation
    public void studentInfo(){
        System.out.println("Name: Abdullah Al Naiem");
    }
}
class abstraction {
    public static void main(String[] args){
        Student obj = new Naiem();
        obj.studentInfo();
        obj.academicInfo();
    }
}