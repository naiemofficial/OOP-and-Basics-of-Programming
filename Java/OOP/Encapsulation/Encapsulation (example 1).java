class enc_Student {
    private String name;
    void setName(String studentName){
        name = studentName;
    }
    void getName(){
        System.out.println("Name: " + name);
    }
}
class encap {
    public static void main(String[] args) {
        enc_Student naiem = new enc_Student();
        naiem.setName("Abdullah Al Naiem");
        naiem.getName();
    }
}