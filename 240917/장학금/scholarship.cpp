#include <iostream>
using namespace std;

int main() {
    int mid;
    int fin;
    cin >> mid >> fin;
    if (mid>=90 && fin>=95) {
        cout << "100000" << endl;
    }
    else if (mid>=90 && fin>=90) {
        cout << "50000" << endl;
    }
    else { 
        cout << "0" << endl;
    }
    return 0;
}