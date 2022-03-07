#include <iostream>
using namespace std;

class Student {
    public:
        void instituteInfo(){ 
            cout << "Institute of Engineering" << endl; // just a random name
            cout << "EIIN: 654321" << endl;
        }
        virtual void academicInfo() = 0; // pure-virtual function 1
        virtual void studentInfo() = 0; // pure-virtual function 2
};
class Naiem : public Student {
    void academicInfo(){
        cout << "Dept. of Computer" << endl;
    }
    void studentInfo(){
        cout << "Name: Abdullah Al Naiem" << endl;
    }
};
class Sakib:public Student {
    void academicInfo(){
        cout << "Dept. of Computer" << endl;
    }
    void studentInfo(){
        cout << "Name: Abdullah Al Naiem" << endl;
    }
};

int main(){
    Student *student1 = new Naiem();
    student1->instituteInfo();
    student1->academicInfo();
    student1->studentInfo();

    cout << endl;

    Student *student2 = new Naiem();
    student2->instituteInfo();
    student2->academicInfo();
    student2->studentInfo();
}