#include <iostream>

using namespace std;

int main()
{
    int statusReg = 0b10110001;  // Read-only from firmware side
    int controlReg = 0b00000000; // Firmware writes here
    int dataReg = 0b11001010;    // For reassignment demo

    const int* regPtr1 = &statusReg;

    cout << "Status register : " << *regPtr1 << endl;

    // const int* means the VALUE cannot be modified through the pointer, but the pointer can point to another address

    int *const regPtr2 = &controlReg;

    cout << "Control register : " << *regPtr2 << endl;

    // *const regptr2 means the pointer always points to controlReg it can't change, but the value can be modified through pointer.

    const int *const regPtr3 = &statusReg;

    cout << *regPtr3 << endl;
 
    // Cannot modify the address and value because the pointer and int both are const.

}