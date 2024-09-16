#include <iostream>
using namespace std;

int main() {
    int A_math;
    int A_eng;
    int B_math;
    int B_eng;
    cin >> A_math >> A_eng;
    cin >> B_math >> B_eng;
    if (A_math>B_math && A_eng>B_eng) {
        cout << 1 << endl;
    }
    else {
        cout << 0 << endl;
    }
    return 0;
}