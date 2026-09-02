#include <iostream>
#include <string>

using namespace std;

class Product
{

private:
    int productId;
    string name;
    double productPrice;
    int quantity;

    static int productCount;

public:
    Product()
    {

        productCount++;
        productId = 1000 + productCount;
        name = " ";
        productPrice = 0;
        quantity = 0;
    }
    void setName(const string &n)
    {
        name = n;
    }

    void setPrice(const double &p)
    {
        productPrice = p;
    }

    void setQuantity(const int &q)
    {
        quantity = q;
    }

    // getter

    int getProductId() const
    {
        return productId;
    }
    string getProductName() const
    {
        return name;
    }

    double getProductPrice() const
    {
        return productPrice;
    }

    void acceptDetails()
    {
        string name;
        double price;
        int quantity;
        int threshold;

        cout << "Enter the product name : " << endl;
        cin >> name;
        setName(name);

        cout << "Enter the Price : " << endl;
        cin >> price;
        setPrice(price);

        cout << "Enter the quantity : " << endl;
        cin >> quantity;
        setQuantity(quantity);
    }

    void displayDetails() const
    {

        cout << productId << "     " << name << "     " << productPrice << "     " << quantity << "    " << totaleValue() << endl;
    }

    static int getProductCount()
    {
        return productCount;
    }

    double totaleValue() const
    {
        return productPrice * quantity;
    }

    bool isLowStock(int threshold) const
    {
        return quantity > threshold;
    }
};

// Function overloading

double reorderCost(int qty, double unitPrice)
{
    return qty * unitPrice;
}

double reorderCost(double qty, double unitPrice)
{
    return unitPrice * qty;
}

double reorderCost(int qty, double unitPrice, double taxRate)
{
    return qty * unitPrice * (1 + taxRate);
}

double applyDiscount(double price, double discountPercent = 10.0)
{
    return price - (price * (discountPercent / 100));
}

int Product ::productCount = 0;

int main()
{

    int size = 5;
    Product arrProduct[size];
    int highestValue = 0;

    for (int i = 0; i < size; i++)
    {
        arrProduct[i].acceptDetails();
    }

    cout << "    ===== INVENTORY REPORT =====" << endl;
    cout << "ID" << "       Name" << "      Price" << "     Qty" << "    Total Value" << endl;
    for (int i = 0; i < size; i++)
    {
        arrProduct[i].displayDetails();
    }

    int highestIndex = 0;

    for (int i = 0; i < size; i++)
    {
        if (arrProduct[i].totaleValue() > arrProduct[highestIndex].totaleValue())
        {
            highestIndex = i;
        }
    }

    int highestValues = arrProduct[highestIndex].totaleValue();

    int threshold = 10;
    string displayName = " ";
    for (int i = 0; i < size; i++)
    {
        bool isValid = arrProduct[i].isLowStock(threshold);
        if (isValid)
        {
            displayName = arrProduct[i].getProductName();
        }
    }

    cout << "Highest value product : " << displayName << " (Rs. " << highestValues << ")" << endl;
    cout << "Low Stock (threshold: " << threshold << " ) : " << displayName << endl;
    cout << endl;
    cout << "Integer Quantity Cost: Rs. " << reorderCost(10, 25.5) << endl;
    cout << "Fractional Quantity Cost: Rs. " << reorderCost(2.5, 100.0) << endl;
    cout << "Cost With Tax: Rs. " << reorderCost(10, 25.5, 18.0) << endl;
    cout << "Price after default discount: Rs. " << applyDiscount(1000) << endl;
    cout << "Price after 20% discount: Rs. " << applyDiscount(1000, 20.0) << endl;
    return 0;
}