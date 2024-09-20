#include <iostream>
using namespace std;

int main() {
    int n;
    int mul=1;
    cin >> n;
    for (int i=1; i<=5; i++) {
        mul=i*n;
        cout << mul << " ";
    }
    return 0;
}