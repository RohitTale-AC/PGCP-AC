#include <iostream>
#include <cstring>

using namespace std;

class LogBuffer
{
private:
    char *buffer;
    int capacity;
    int size;

    static int instanceCount;

public:
    // Constructor
    LogBuffer(int capacity)
    {
        this->capacity = capacity;
        this->size = 0;

        buffer = new char[capacity];

        instanceCount++;

        cout << "[LogBuffer Created] capacity="
             << capacity << endl;
    }

    // Copy Constructor - Deep Copy
    LogBuffer(const LogBuffer &other)
    {
        capacity = other.capacity;
        size = other.size;

        // Allocate NEW memory
        buffer = new char[capacity];

        // Copy contents
        for (int i = 0; i < size; i++)
        {
            buffer[i] = other.buffer[i];
        }

        instanceCount++;

        cout << "[LogBuffer Deep Copied] capacity="
             << capacity << endl;
    }

    // Copy Assignment Operator
    LogBuffer &operator=(const LogBuffer &other)
    {
        // Self-assignment check
        if (this == &other)
        {
            cout << "[Self-assignment detected — no operation]"
                 << endl;

            return *this;
        }

        delete[] buffer;

        // Copy values
        capacity = other.capacity;
        size = other.size;

        // Allocate new memory
        buffer = new char[capacity];

        // Deep copy
        for (int i = 0; i < size; i++)
        {
            buffer[i] = other.buffer[i];
        }

        cout << "[LogBuffer Assigned]" << endl;

        return *this;
    }

    // Destructor
    ~LogBuffer()
    {
        delete[] buffer;

        instanceCount--;

        cout << "[LogBuffer Destroyed]" << endl;
    }

    void append(const char *msg)
    {
        int i = 0;

        while (msg[i] != '\0' && size < capacity - 1)
        {
            buffer[size] = msg[i];

            size++;
            i++;
        }

        buffer[size] = '\0';
    }

    void print() const
    {
        cout << buffer << endl;
    }

    void clear()
    {
        size = 0;

        buffer[0] = '\0';
    }

    static int getInstanceCount()
    {
        return instanceCount;
    }
};

int LogBuffer::instanceCount = 0;

int main()
{
    // Objective 1
    LogBuffer log1(256);

    log1.append("Server started on port 8080");

    log1.append(
        " | Request received from 192.168.1.10");

    log1.print();

    // Objective 2 - Copy Constructor
    LogBuffer log2 = log1;

    log2.append(" | Cached response sent");

    cout << "log1 : ";
    log1.print();

    cout << "log2 : ";
    log2.print();

    // Objective 3 - Copy Assignment Operator
    LogBuffer log3(128);

    log3 = log1;

    cout << "log3 : ";
    log3.print();

    // Objective 4 - Self Assignment
    log1 = log1;

    log1.print();

    // Objective 5 - Static Member
    cout << "Live LogBuffer objects : "
         << LogBuffer::getInstanceCount()
         << endl;

    return 0;
}