#include <iostream>
using namespace std;

int main() {
    float eye_avg;
    cin >> eye_avg;
    if (eye_avg >= 1.0) {
        cout << "High" << endl;
    }
    else if (eye_avg >= 0.5) {
        cout << "Middle" << endl;
    }
    else {
        cout << "Low" << endl;
    }
    return 0;
}