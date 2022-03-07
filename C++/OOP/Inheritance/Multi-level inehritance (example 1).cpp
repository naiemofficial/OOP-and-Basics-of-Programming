#include <iostream>
using namespace std;

class Institute {
    public:
        string institute_name = "Institute of Engineering"; // just a random name
};
class Teacher : public Institute {
    public:
        string teacher_name = "Bjarne Stroustrup";
        string subject = "C Plus Plus";
};
class Student : public Teacher {
    public: 
        string student_name = "Abdullah Al Naiem";
        
        void displayInfo(){
            cout << "Institute Name: " << institute_name << endl;
            cout << "Teacher Name  : " << teacher_name << endl;
            cout << "Student Name  : " << student_name << endl;
            cout << "Class of      : " << subject << endl;
        }
};

int main(){
    Student obj;
    obj.displayInfo();
}