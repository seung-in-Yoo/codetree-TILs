#include <iostream>
using namespace std;

int main() {
    float a;
    float b;
    cin >> a;
    cin >> b;
    if (a>=1.0 && b>=1.0) {
        cout << "High" << endl;
    }
    else if (a>=0.5 && b>=0.5) {
        cout << "Middle" << endl;
    }
    else {
        cout << "Low" << endl;
    }
    return 0;
}