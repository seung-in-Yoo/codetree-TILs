#include <iostream>
using namespace std;

int main() {
    int A_math;
    int A_eng;
    int B_math;
    int B_eng;
    cin >> A_math >> A_eng;
    cin >> B_math >> B_eng;
    if (A_math > B_math) {
        cout << "A" << endl;
    }
    else if (B_math > A_math) {
        cout << "B" << endl;
    }
    else if (A_math==B_math && A_eng>B_eng) {
        cout << "A" << endl;
    }
    else if (A_math==B_math && B_eng>A_eng) {
        cout << "B" << endl;
    }
    else {
        cout << "점수를 다시 입력하세요." << endl;
    }
    return 0;
}