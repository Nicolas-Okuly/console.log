#include <iostream>

class console { public: void log(std::string input){ std::cout<<input<<std::endl; } };

int main() {
    console console;
    console.log("Hello World!");
    return 0;
}