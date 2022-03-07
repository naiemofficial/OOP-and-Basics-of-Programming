#include <iostream>
using namespace std;

class Teacher {
    public:
        string teacher_name = "Bjarne Stroustrup";
        string subject = "C Plus Plus";

        void teacherInfo() {
            cout << "Teacher info: \n--------------" << endl;
            cout << "Name   : " << teacher_name << endl;
            cout << "Subject: " << subject << endl;
        }
};
class Student : public Teacher {
    public:
        string student_name = "Abdullah Al Naiem";
        int id = 123456;

        void studentInfo() {
            cout << "\nStudent info: \n--------------" << endl;
            cout << "Name: " << student_name << endl;
            cout << "ID  : " << id << endl;
            cout << "Class of: " << subject << endl;
        }
};


int main(){
    Student get;
    get.teacherInfo();
    get.studentInfo();
}