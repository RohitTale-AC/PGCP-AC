#include <iostream>
#include <cmath>
using namespace std;



	inline double distanceBetween(double x1, double y1, double x2, double y2){


		return sqrt( pow(x2-x1,2) + pow(y2-y1,2) );

	}

	inline double toRadians(double degrees){

		return degrees * (M_PI/180.0);
	}

	inline double clamp(double value, double minVal, double maxVal){

		if(value < minVal){
			return minVal;
		}else if (value > maxVal){
			return maxVal;
		}else{
			return value;
		}
	}

	inline bool isInSafeZone(double x, double y, double cx, double cy, double radius){

		double distance = distanceBetween(x,y,cx,cy);

		if(distance <= radius){
			return true;
		}else{
			return false;
		}
	}

int main() {
	double homeX = 0.0;
	double homeY  = 0.0;

	double safeZoneRadius = 50.0;

	double waypointX1 = 30.0;
	double waypointY1 = 10.0;

	double waypointX2 = 40.0;
	double waypointY2 = 20.0;


	double waypointX3 = 30.0;
	double waypointY3 = 90.0;



	double distance1 = distanceBetween(homeX,homeY,waypointX1,waypointY1);
	 cout << "Waypoint 1" << endl;
	 cout << "Distance from home: " << distance1 << endl;
	 cout<< boolalpha << "Inside safe zone: "<< isInSafeZone(waypointX1, waypointY1, homeX, homeY, safeZoneRadius)<< endl;
	 cout << "==========================" << endl;

	 double distance2 = distanceBetween(homeX,homeY,waypointX2,waypointY2);
	 	cout << "Waypoint 2" << endl;
	 	cout << "Distance from home: " << distance2 << endl;
	 	cout << boolalpha << "Inside safe zone: "<< isInSafeZone(waypointX2, waypointY2, homeX, homeY, safeZoneRadius)<< endl;
	 	cout << "==========================" << endl;

	 double distance3 = distanceBetween(homeX,homeY,waypointX3,waypointY3);
	 	cout << "Waypoint 3" << endl;
	 	cout << "Distance from home: " << distance3 << endl;
	 	cout << boolalpha << "Inside safe zone: "<< isInSafeZone(waypointX3, waypointY3, homeX, homeY, safeZoneRadius)<< endl;
	 	cout << "==========================" << endl;



	return 0;
}