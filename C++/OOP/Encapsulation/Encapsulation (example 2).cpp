#include <iostream>
using namespace std;

class Student{
    private:
        string name;
        int id;

    public:
        void setInfo(string studentName, int studentID){
            name = studentName;
            id = studentID;
        }

        void getInfo(){
            cout << "Name: " << name << endl;
            cout << "ID  : " << id << endl;
        }
};

int main(){
    Student naiem;
    naiem.setInfo("Abdullah Al Naiem", 123456);
    naiem.getInfo();

    cout << endl;

    Student sakib;
    sakib.setInfo("Sakibur Rahman", 456123);
    sakib.getInfo();
}