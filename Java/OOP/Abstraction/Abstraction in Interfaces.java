interface __Student {
    void studentInfo();
    void academicInfo();
}
class __Naiem implements __Student {
    public void studentInfo(){
        System.out.println("Name: Abdullah Al Naiem");
    }
    public void academicInfo(){
        System.out.println("Dept. of Computers");
    }
}
class __abstraction {
    public static void main(String[] args){
        __Student obj = new __Naiem();
        obj.studentInfo();
        obj.academicInfo();
    }
}