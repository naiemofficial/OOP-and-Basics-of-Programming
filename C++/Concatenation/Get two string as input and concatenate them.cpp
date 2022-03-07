#include <iostream>
using namespace std;

int main(){
    string first_name, last_name;
    cout << "Enter your first name: ";
    getline(cin, first_name);
    cout << "Enter your last name: ";
    getline(cin, last_name);

    cout << "Your name is: " + first_name + last_name;

    /*
     * This print also can be done with this following way
     * ---------------------------------------------------
     * string result = first_name + last_name;
     * cout << "Your name is: " + result;
     */
}