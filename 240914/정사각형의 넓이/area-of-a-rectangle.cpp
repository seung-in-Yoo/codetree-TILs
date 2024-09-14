#include <iostream>
using namespace std;

int main() {
    int n;
    int area;
    cin >> n;
    area = n*n;
    cout << area << endl;
    if (n<5) {
        cout << "tiny" << endl;
    }
    return 0;
}