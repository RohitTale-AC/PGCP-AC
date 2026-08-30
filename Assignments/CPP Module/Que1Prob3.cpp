#include <iostream>
#include <cmath>

using namespace std;

int main()
{

    double temp[3][3]{
        {24.0, 31.5, 28.0},
        {45.0, 22.0, 30.0},
        {19.0, 27.5, 50.2}};

    int maxy = INT_MIN;
    int floorNo = 0;
    int roomNo = 0;
    int averageFloor = 0;
    double hottestRoom = temp[0][0];
    int warning = 0;
    double highestAverage = 0;

    cout << "              ";
    for (int i = 0; i < 3; i++)
    {
        cout << "Room" << i + 1 << "   ";
    }
    cout << endl;
    for (int i = 0; i < 3; i++)
    {
        cout << "Floor " << i + 1 << " :  ";
        for (int j = 0; j < 3; j++)
        {
            cout << "     " << temp[i][j];
        }
        cout << endl;
    }

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (temp[i][j] > hottestRoom)
            {
                hottestRoom = temp[i][j];
                floorNo = i + 1;
                roomNo = j + 1;
            }
        }
    }

    for (int i = 0; i < 3; i++)
    {
        double sum = 0;
        for (int j = 0; j < 3; j++)
        {
            sum = sum + temp[i][j];
        }
        double average = sum / 3;
        if (average > highestAverage)
        {
            highestAverage = average;
            averageFloor = i + 1;
        }
        // cout << sum << endl;
        // cout << average << endl;
    }

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (temp[i][j] > 30)
            {
                warning++;
            }
        }
    }
    cout << endl;
    cout << "Hottest Room : Floor " << floorNo << ", Room " << roomNo << " > " << hottestRoom << "C" << endl;
    cout << "Hottest Floor : Floor " << averageFloor << " (avg " << highestAverage << "C)" << endl;
    cout << "Rooms at WARNING or above : " << warning;

    // cout << "Hotest room : Floor ";
}
