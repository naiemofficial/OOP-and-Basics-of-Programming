#include <iostream>
using namespace std;

class constructor {
    public:
        constructor(string department){
            cout << "Dept. of " << department << endl;
        }
        constructor(string name, int id){
            cout << "Student Name: " << name << endl;
            cout << "ID: " << id << endl;
        }
};

int main(){
    constructor department("Computer Engineering");
    constructor student("Abdullah Al Naiem", 123456);
}