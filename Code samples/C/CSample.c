/*
    This code creates an array of characters and prints the array to
    the console. This demonstrates how strings in C are treated as
    arrays of characters.
*/

#include <stdio.h>

int main() {

  char hello[6] = {'H', 'e', 'l', 'l', 'o', '\0'};
  printf(hello);

  return 0;
}