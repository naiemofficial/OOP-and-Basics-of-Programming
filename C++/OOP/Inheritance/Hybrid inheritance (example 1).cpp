#include <iostream>
using namespace std;

class Institute {
    public:
        string institute_name = "Institute of Engineering" ; // just a random name
};
class Teacher {
    public:
        string teacher_name = "Bjarne Stroustrup";
        string subject = "C Plus Plus";
};
class Student {
    public: 
        string student_name = "Abdullah Al Naiem";
};

class Multiple_Inh : public Institute, public Teacher, public Student {
    public:
        void displayInfo(){
            cout << institute_name << endl;
            cout << "Teacher: " << teacher_name << endl;
        }
};

class Hybrid_Inh : public Multiple_Inh {
    public:
        void displayInfo(){
            cout << "Subject: " << subject << endl;
            cout << "Student: " << student_name << endl;
        }
};

int main(){
    Multiple_Inh teacher;
    teacher.displayInfo();

    Hybrid_Inh student;
    student.displayInfo();
}