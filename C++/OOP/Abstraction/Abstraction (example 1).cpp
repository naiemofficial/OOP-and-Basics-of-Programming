#include <iostream>
using namespace std;

class Student {
    public:
        virtual void studentInfo() = 0; // pure-virtual function
        void academicInfo(){
            cout << "Dept. of Computer" << endl;
        }
};
class Naiem : public Student {
    public:
        void studentInfo(){
            cout << "Name: Abdullah Al Naiem" << endl;
        }
};
int main(){
    Student* obj = new Naiem();
    obj->studentInfo();
    obj->academicInfo();
}