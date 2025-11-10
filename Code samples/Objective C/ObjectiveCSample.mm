/*
    The following code intitializes an array with three string values
    and prints each value using NSLog.
*/

#import <Foundation/Foundation.h>
#include <stdio.h>

int main (int argc, const char * argv[])
{
    NSAutoreleasePool * pool = [[NSAutoreleasePool alloc] init];
    
    NSArray *array = [NSArray arrayWithObjects: @"one", @"two", @"three", nil];
    
    for(NSString *value in array){
         NSLog(value);
    }
     
    [pool drain];
    return 0;
}