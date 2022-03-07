#include <iostream>
using namespace std;

int main(){
    char operation;
    cout << "('+'=addition), ('-'=addition), ('x'or'*'=multiplication), ('/'=division), ('%'=modulus)" << endl;
    cout << "Select the operation: ";
    cin >> operation;

    int num1, num2;
    cout << "Enter the first number: ";
    cin >> num1;
    cout << "Enter the second number: ";
    cin >> num2;

    int sum = 0; bool flag = true;
    if (operation == '+') {
        sum = num1 + num2;
    } else if(operation == '-') {
        sum = num1 - num2;
    } else if(operation == 'X' || operation == 'x' || operation == '*') {
        sum = num1 * num2;
    } else if(operation == '/') {
        sum = num1 / num2;
    } else if(operation == '%') {
        sum = num1 % num2;
    } else {
        flag = false;
    }

    if (flag == true) {
        cout << "The result is = " << sum;
    } else {
        cout << "Error! Invalid operation";
    }
}