#include <iostream>
#include <string>
#include <vector>

using namespace std;

// Part A
enum class HttpStatus
{
    OK = 200,
    Created = 201,
    BadRequest = 400,
    Unauthorized = 401,
    NotFound = 404,
    ServerError = 500
};
void handleResponse(HttpStatus status, const string &endpoint)
{
    int statusCode = static_cast<int>(status);
    switch (statusCode)
    {
    case 200:
        cout << endpoint << "  " << statusCode << " : Request successful" << endl;
        break;
    case 201:
        cout << endpoint << "  " << statusCode << " : Authentication required" << endl;
        break;
    case 400:
        cout << endpoint << "  " << statusCode << " : Endpoint does not exist" << endl;
        break;
    case 401:
        cout << endpoint << "  " << statusCode << " : Internal server error - retry later" << endl;
        break;
    case 404:
        cout << endpoint << "  " << statusCode << " : Internal server error - retry later" << endl;
        break;
    case 500:
        cout << endpoint << "  " << statusCode << " : Internal server error - retry later" << endl;
        break;
    }
}

// Part B
using Header = pair<string, string>;
using HeaderList = vector<Header>;
using Port = unsigned int;
using IPAddress = string;

void printHeaders(const HeaderList &headers)
{

    for (const Header &header : headers)
    {
        cout << header.first << " : " << header.second << endl;
    }
}

int main()
{

    // Part A
    handleResponse(HttpStatus::OK, "[GET/api/users]");
    handleResponse(HttpStatus::Created, "[POST /api/login]");
    handleResponse(HttpStatus::BadRequest, "[GET /api/products/99]");
    handleResponse(HttpStatus::Unauthorized, "[GET /api/products/99]");
    handleResponse(HttpStatus::NotFound, "[GET /api/products/99]");
    handleResponse(HttpStatus::ServerError, "[POST /api/order]");

    // Part B
    typedef unsigned long long RequestId;
    RequestId requestId = 1748293847;

    // IPAddress requestId = "1748293847";
    Port serverPort = 8080;

    HeaderList headers = {
        {"content-Type", "application/json"},
        {"Authorization ", "Bearer eyJhbGci..."},
        {"Accept-Language", "en-US"}};

    cout << "Request ID : " << requestId << endl;
    cout << "Server Port : " << serverPort << endl;

    printHeaders(headers);
}