#include <iostream>
using namespace std;

class overloading {
    public:
        void sum(int num1, int num2){
            cout << "Sum of (addition) = " << (num1 + num2) << endl;
        }
        void sum(int num1, double num2){
            cout << "Sum of (addition) = " << (num1 + num2) << endl;
        }
        void sum(double num1, int num2){
            cout << "Sum of (multiplication) = " << (num1 * num2) << endl;
        }
};

int main(){
    overloading calculate;
    calculate.sum(2, 3);
    calculate.sum(4, 5.6);
    calculate.sum(7.8, 9);
}