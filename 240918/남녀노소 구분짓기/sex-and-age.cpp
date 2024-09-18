#include <iostream>
using namespace std;

int main() {
    int gen_num;
    int age_num;
    cin >> gen_num;
    cin >> age_num;
    if (gen_num == 0) {
        if (age_num>=19) {
            cout << "MAN" << endl;
        }
        else {
            cout << "BOY" << endl;
        }
    }
    if (gen_num == 1) {
        if (age_num>=19) {
            cout << "WOMAN" << endl;
        }
        else {
            cout << "GIRL" << endl;
        }
        
    }
    return 0;
}