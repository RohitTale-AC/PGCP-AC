#include <iostream>
#include <cmath>

using namespace std;

int resetSensorPairV1(int reading1, int reading2)
{

    int temp = reading1;
    reading1 = reading2;
    reading2 = temp;

    return 0;
}

int resetSensorPairV2(int &reading1, int &reading2)
{

    int temp = reading1;
    reading1 = reading2;
    reading2 = temp;

    return 0;
}

int resetSensorPairV3(int *reading1, int *reading2)
{

    int temp = *reading1;
    *reading1 = *reading2;
    *reading2 = temp;

    return 0;
}

int main()
{

    int reading1 = 55;
    int reading2 = 12;
    // It is  function calling by a value while we send the values form the main function and returning it in same fuction
    //"Thus it returns the same copy of the values in same variables";

    cout << " --- V1: Call by Value --- " << endl;
    cout << "Before : A=" << reading1 << "  B=" << reading2 << endl;
    resetSensorPairV1(reading1, reading2);
    cout << "After  : A=" << reading1 << "  B=" << reading2 << "     -values unchanged" << endl;

    // It is  function calling by a reference value in the function by using the "&" to the variable in the function which denoted the reference
    //  of the variable after swapping the reference value sent to the main function in the form of reference not the copy.
    
    cout << " --- V1: Call by Reference --- " << endl;
    cout << "Before : A=" << reading1 << "  B=" << reading2 << endl;
    resetSensorPairV2(reading1, reading2);
    cout << "After  : A=" << reading1 << "  B=" << reading2 << "     -values swapped" << endl;

    // It is function calling by a pointer which store the address of the variable . we passing the reference/address of the variable by using "&" from the
    //  main function and store it to the pointer variable for the swapping. This swapping is done by the pointer by swapping the swaaping the
    // address itself and return to the main function that swap values.

    cout << " --- V1: Call by Pointer --- " << endl;
    cout << "Before : A=" << reading1 << "  B=" << reading2 << endl;
    resetSensorPairV3(&reading1, &reading2);
    cout << "After  : A=" << reading1 << "  B=" << reading2 << "     -values swapped back" << endl;
}