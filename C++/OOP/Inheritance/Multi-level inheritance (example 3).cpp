#include <iostream>
using namespace std;

class Institute {
    private:
        string institute_name = "Institute of Engineering"; // just a random name
        int eiin = 654321;
    
    public:
        void instituteInfo(){
            cout << "Institute info: \n--------------" << endl;
            cout << "Name: " << institute_name << endl;
            cout << "EIIN: " << eiin << endl;
        }
};
class Teacher : public Institute {
    public:
        string teacher_name = "Bjarne Stroustrup";
        string subject = "C Plus Plus";

        void teacherInfo(){
            cout << "\nTeacher info: \n--------------" << endl;
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
    get.instituteInfo();
    get.teacherInfo();
    get.studentInfo();
}