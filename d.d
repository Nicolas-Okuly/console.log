import std.stdio;

class console { void log(string input) { writeln(input); } }

void main() {
    console console = new console();
    console.log("Hello World!");
}
