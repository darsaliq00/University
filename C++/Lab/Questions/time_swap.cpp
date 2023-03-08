#include <iostream>

struct Time {
    int hours;
    int minutes;
    int seconds;
};

class Swapper {
public:
    void swap(Time& t1, Time& t2) {
        Time temp = t1;
        t1 = t2;
        t2 = temp;
    }
};

int main() {
    Swapper swapper;
    Time time1 = { 20, 20, 01 };
    Time time2 = { 14, 35, 02 };
    std::cout << "Before swap: time1 = " << time1.hours << ":" << time1.minutes << ":" << time1.seconds << ", "
              << "time2 = " << time2.hours << ":" << time2.minutes << ":" << time2.seconds << std::endl;
    swapper.swap(time1, time2);
    std::cout << "After swap: time1 = " << time1.hours << ":" << time1.minutes << ":" << time1.seconds << ", "
              << "time2 = " << time2.hours << ":" << time2.minutes << ":" << time2.seconds << std::endl;
}
