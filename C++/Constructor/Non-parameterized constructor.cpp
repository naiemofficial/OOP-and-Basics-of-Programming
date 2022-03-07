#include <iostream>
using namespace std;

class constructor {
    public:
        constructor(){
            cout << "Constructor calling successful";
        }
};

int main(){
    constructor object;
}