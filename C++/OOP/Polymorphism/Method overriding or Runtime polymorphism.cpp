#include <iostream>
using namespace std;

class Parent {
    public:
        void address() {
            cout << "I'm from Dhaka, Bangladesh" << endl;
        }
};
class Child : public Parent {
    public:
        void address() {
            cout << "I'm from Chittagong, Bangladesh" << endl;
        }
};

int main(){
    Parent Pr;
    Pr.address();

    Child Ch;
    Ch.address();
}