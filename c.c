#include <stdio.h>

typedef struct { int (*log)(const char *, ...); } console;

void main(){
    console console = { printf };
    console.log("Hello World!");
}