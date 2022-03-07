#include <iostream>
using namespace std;

int main(){
    int num1, num2;
    cout << "Enter the first number: ";
    cin >> num1;
    cout << "Enter the second number: ";
    cin >> num2;

    cout << "The result is = " + to_string(num1) + to_string(num2);

    /*
     * This print also can be done with this following way
     * ---------------------------------------------------
     * string result = to_string(num1) + to_string(num2);
     * cout << "The result is = " + result;
     */
}