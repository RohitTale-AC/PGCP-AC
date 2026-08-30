#include <iostream>
#include <cmath>

using namespace std;

// Question 1

int main()
{
    double celsius = 47.3;
    int statusCode;
    string reading;
    string action;

    // cout << "Enter the temperature : ";
    // cin >> celsius;

    if (celsius < 0)
    {
        statusCode = -1;
    }
    else if (celsius > 0 && celsius <= 29)
    {
        statusCode = 0;
    }
    else if (celsius >= 30 && celsius <= 44)
    {
        statusCode = 1;
    }
    else if (celsius >= 45 && celsius <= 59)
    {
        statusCode = 2;
    }
    else if (celsius >= 60)
    {
        statusCode = 3;
    }
    else
    {
        cout << "Invalid number";
    }
    double fahrenheit = (celsius * 9 / 5) + 32;
    cout << "Temperature : " << celsius << "C" << " / " << fahrenheit << "F" << endl;

    switch (statusCode)
    {
    case -1:
        cout << "Status      : " << "SENSOR_ERROR" << endl;
        cout << "Action      : " << "Sensor fault -- check wiring" << endl;
        break;
    case 0:
        cout << "Status      : " << "NORMAL" << endl;
        cout << "Action      : " << "No action required" << endl;
        break;
    case 1:
        cout << "Status      : " << "WARNING" << endl;
        cout << "Action      : " << "Alert sent to supervisor" << endl;
        break;
    case 2:
        cout << "Status      : " << "CRITICAL" << endl;
        cout << "Action      : " << "Cooling system triggered" << endl;
        break;
    case 3:
        cout << "Status      : " << "SHUTDOWN" << endl;
        cout << "Action      : " << "Emergency shutdown initiated" << endl;
        break;
    }

    cout << "Reading     : " << ((celsius > 25) ? "Above Average" : "Below Average") << endl;
}
