#include <iostream>
using namespace std;

int main() {
    char n;
    cin >> n;
    if (n=='S') {
        cout << "Superior" << endl;
    }
    else if (n=='A') {
        cout << "Excellent" << endl;
    }
    else if (n=='B') {
        cout << "Good" << endl;
    }
    else if (n=='C') {
        cout << "Usually" << endl;
    }
    else if (n=='D') {
        cout << "Effort" << endl;
    }
    else {
        cout << "Failure" << endl;
    }
    return 0;
}