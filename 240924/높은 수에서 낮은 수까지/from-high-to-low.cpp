#include <iostream>
using namespace std;

int main() {
    int a;
    int b;
    cin >> a >> b;
    if (a>=b) {
        for (int i=a; i>=b; i--) {
            cout << i << " ";
        }
    }
    else if (b>=a) {
        for (int i=b; i>=a; i--) {
            cout << i << " ";
        }
    }
    return 0;
}