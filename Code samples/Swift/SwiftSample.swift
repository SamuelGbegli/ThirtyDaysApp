/*
    The following creates a variable called total and enters a for loop, where
    the the value of i is added to total before being printed to the console.
*/

var total = 0
for i in 0..<10 {
    total += i
    print("The value of total is \(total).")
}