#include <iostream>
#include <cmath>

using namespace std;

double computeRMS(double *signal, int n)
{
    double sum = 0;
    double *ptr = signal;
    for (int i = 0; i < 7; i++)
    {
        sum = sum + (*signal) * (*signal);
        signal++;
    }

    return sqrt(sum / n);
}

void normalise(double *signal, int n)
{

    int maxValue = 0;
    double *ptr = signal;

    for (int i = 0; i < n; i++)
    {
        if (abs(*ptr) > maxValue)
        {
            maxValue = abs(*ptr);
        }
        ptr++;
    }

    ptr = signal;

    for (int i = 0; i < n; i++)
    {
        *ptr = *ptr / maxValue;
        ptr++;
    }
}

int countZeroCrossings(double *signal, int n)
{
    int count = 0;
    double *ptr = signal;

    for (int i = 0; i < n; i++)
    {
        if (*ptr < 0 && *(ptr + 1) > 0 || *ptr > 0 && *(ptr + 1) < 0)
        {
            count++;
        }
        ptr++;
    }
    return count;
}

void applyGain(double *signal, int n, double gainFactor)
{
    double *ptr = signal;

    for (int i = 0; i < n; i++)
    {
        *ptr = *ptr * gainFactor;
        ptr++;
    }
}

int main()
{
    int n = 7;
    double signal[n] = {0.5, -1.2, 0.8, -0.3, 1.0, -0.9, 0.1};

    cout << "RMS : " << computeRMS(signal, n) << endl;

    cout << "Normalise : " << endl;

    normalise(signal, n);

    cout << "Count zero crossing : " << countZeroCrossings(signal, n);

    // applyGain(signal, n, gainFactor);
}
