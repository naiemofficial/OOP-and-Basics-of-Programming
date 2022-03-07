#include <iostream>
using namespace std;

class Teacher {
    public:
        string teacher_name = "Bjarne Stroustrup";
        string subject = "C Plus Plus";
        
        void teacherInfo() {
            cout << "Teacher Name: " << teacher_name << endl;
        }
};
class Student : public Teacher {
    public:
        string student_name = "Abdullah Al Naiem";
        int id = 123456;
    
        void studentInfo() {
            cout << "Student Name: " << student_name << endl;
            cout << "Student ID  : " << id << endl;
            cout << "Class of    : " << subject << endl;
        }
};

int main(){
    Student obj;
    obj.teacherInfo();
    obj.studentInfo();
}