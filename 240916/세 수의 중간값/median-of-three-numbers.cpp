#include <iostream>
using namespace std;

int main() {
    int a;
    int b;
    int c;
    cin >> a >> b >> c;
    if (b>a && b<c) {
        cout << 1 << endl;
    }
    else {
        cout << 0 << endl;
    }
    return 0;
}