#include <iostream>
using namespace std;

class Student{
    private:
        string name;
    
    public:
        void setName(string studentName){
            name = studentName;
        }

        void getName(){
            cout << "Name: " << name;
        }
};

int main(){
    Student naiem;
    naiem.setName("Abdullah Al Naiem");
    naiem.getName();
}