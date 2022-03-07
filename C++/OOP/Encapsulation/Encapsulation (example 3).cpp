#include <iostream>
using namespace std;

class Student{
  private:
    string name, dept;
    void academicInfo(string department) {
        cout << "Institute of Engineering" << endl; // just a random name
        cout << "Dept. of " << department << endl;
    }

  public:
    void setName(string studentName){
        name = studentName;
    }
    void setDept(string studentDept){
        dept = studentDept;
    }

    void displayInfo(){
        academicInfo(dept);
        cout << "Name: " << name << endl;
    }
};

int main(){
    Student naiem;
    naiem.setName("Abdullah Al Naiem");
    naiem.setDept("Computer");
    naiem.displayInfo();
    
    cout << endl;
    
    Student sakib;
    sakib.setName("Sakibur Rahman");
    sakib.setDept("Electrical");
    sakib.displayInfo();
}