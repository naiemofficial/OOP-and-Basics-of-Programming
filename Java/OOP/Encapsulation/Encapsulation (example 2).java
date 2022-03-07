class _enc_Student {
    private String name;
    private int id;
    void setInfo(String studentName, int studentID){
        name = studentName;
        id = studentID;
    }
    void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID  : " + id);
    }
}
class _encap {
    public static void main(String[] args) {
        _enc_Student naiem = new _enc_Student();
        naiem.setInfo("Abdullah Al Naiem", 123456);
        naiem.getInfo();

        System.out.println();

        _enc_Student sakib = new _enc_Student();
        sakib.setInfo("Sakibur Rahman", 456123);
        sakib.getInfo();
    }
}