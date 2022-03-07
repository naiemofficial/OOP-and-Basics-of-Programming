abstract class _Student {
    void instituteInfo(){
        System.out.println("Institute of Engineering"); // just a random name
        System.out.println("EIIN: 654321");
    }
    abstract void academicInfo();
    abstract void studentInfo();
}
class _Naiem extends _Student {
    @Override // annotation
    public void academicInfo(){
        System.out.println("Dept. of Computer");
    }
    public void studentInfo(){
        System.out.println("Name: Abdullah Al Naiem");
        System.out.println("ID  : 123456");
    }
}

class _Sakib extends _Student {
    @Override // annotation
    public void academicInfo(){
        System.out.println("Dept. of Electrical");
    }
    public void studentInfo(){
        System.out.println("Name: Sakibur Rahman");
        System.out.println("ID  : 456123");
    }
}

class _abstraction {
    public static void main(String[] args){
        _Student student1 = new _Naiem();
        student1.instituteInfo();
        student1.studentInfo();
        student1.academicInfo();

        System.out.println();

        _Student student2 = new _Sakib();
        student2.instituteInfo();
        student2.studentInfo();
        student2.academicInfo();
    }
}