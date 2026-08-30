#include <iostream>
#include <cmath>

using namespace std;


int main()
{

    int size = 8;
    // cout << "Enter the size of the array : ";
    // cin >> size;

    double temp[size];

    // double temp[] = {22.1, 31.5, 46.0, 28.0, 50.2, 10.0, 38.0, 19.5};

    int skip = 0;
    int normal = 0, critical = 0, warning = 0, shutdown = 0;
    int sum = 0;

    cout << "Enter the temperature : ";
    for (int i = 0; i < size; i++) // Taking a input for the array
    {
        cin >> temp[i];
    }
    cout << "Valid readings :" << " ";
    for (int i = 0; i < size; i++) // Taking a input for the array
    {
        if (temp[i] <= 0)
        {
            skip++;
            continue;
        }
        cout << temp[i] << " ";
    }
    cout << endl;
    cout << "Skipped (errors) : " << skip << endl;
    for (int i = 0; i < size; i++)
    {
        if (temp[i] >= 45)
        {
            cout << "First CRITCAL : Index " << i << " > " << temp[i] << " C" << endl;
            break;
        }
    }

    double maxy = INT_MIN;
    double minn = INT_MAX;

    for (int i = 0; i < size; i++)
    {
        minn = min(minn, temp[i]);
        maxy = max(maxy, temp[i]);
        sum = sum + temp[i];
    }

    int average = sum / size;

    cout << "Max : " << maxy << " C" << " ";
    cout << "Min : " << minn << " C" << " ";
    cout << "Average : " << average << " C" << " " << endl;

    for (int i = 0; i < size; i++)
    {
        if (temp[i] > 0 && temp[i] < 29)
        {
            normal++;
        }
        else if (temp[i] > 30 && temp[i] < 44)
        {
            warning++;
        }
        else if (temp[i] > 45 && temp[i] < 59)
        {
            critical++;
        }
        else if (temp[i] >= 60)
        {
            shutdown++;
        }
    }
    cout << "Normal:" << normal << " ";
    cout << "Warning:" << warning << " ";
    cout << "Critical:" << critical << " ";
    cout << "Shutdown:" << shutdown << " ";
}