#include <iostream>
using namespace std;

class Institute {
    public:
        string institute_name = "Institute of Engineering"; // just a random name
};
class Teacher : public Institute {
    public:
        string teacher_name = "Bjarne Stroustrup";

        void info() {
            cout << teacher_name << " works as a teacher at " << institute_name << endl;
        }
};
class Student : public Institute {
    public:
        string student_name = "Abdullah Al Naiem";

        void info() {
            cout << student_name << " studying at " << institute_name << endl;
        }
};

int main(){
    Teacher teacher;
    teacher.info();
    Student student;
    student.info();
}