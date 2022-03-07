class __enc_Student {
    private String name, dept;
    private void academicInfo(String department) {
        System.out.println("Institute of Engineering"); // just a random name
        System.out.println("Dept. of " + department);
    }
    void setName(String studentName){
        name = studentName;
    }
    void setDept(String studentDept){
        dept = studentDept;
    }
    void displayInfo(){
        academicInfo(dept);
        System.out.println("Name: " + name);
    }
}
class __encap {
    public static void main(String[] args) {
        __enc_Student naiem = new __enc_Student();
        naiem.setName("Abdullah Al Naiem");
        naiem.setDept("Computer");
        naiem.displayInfo();
        
        System.out.println();
        
        __enc_Student sakib = new __enc_Student();
        sakib.setName("Sakibur Rahman");
        sakib.setDept("Electrical");
        sakib.displayInfo();
    }
}