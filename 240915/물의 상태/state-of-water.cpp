#include <iostream>
using namespace std;

int main() {
    int temp;
    cin >> temp;
    if (temp < 0) {
        cout << "ice" << endl;
    }
    else if (0< temp < 100) {
        cout << "water" << endl;
    }
    else {
        cout << "vapor" << endl;
    }
    return 0;
}