#include <iostream>
using namespace std;

class Institute {
    protected:
        string institute_name = "Institute of Engineering"; // just a random name
        int teacher_salary = 45000;
        int tution_fee = 25000;
};
class Teacher : public Institute {
    public:
        string teacher_name = "Bjarne Stroustrup";

        void info() {
            cout << teacher_name << " works as a teacher at " + institute_name << endl;
            cout << "Salary per month: " << teacher_salary << endl;
        }
};
class Student : public Institute {
    public:
        string student_name = "Abdullah Al Naiem";

        void info() {
            cout << student_name << " studying at " << institute_name << endl;
            cout << "Tution fee per semester: " << tution_fee << endl;
        }
};

int main(){
    Teacher teacher;
    teacher.info();

    cout << endl;

    Student student;
    student.info();
}