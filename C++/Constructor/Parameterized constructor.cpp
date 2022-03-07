#include <iostream>
using namespace std;

class constructor {
    public:
        constructor(string name){
            cout << "Your name is: " << name;
        }
};

int main(){
    constructor student("Abdullah Al Naiem");
}