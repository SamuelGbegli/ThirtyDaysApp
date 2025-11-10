// The following defines a function that takes a list of numbers, then prints out
// each number and their square. The function is called with a list with the numbers
// 1 to 10 inclusive.

let squares list =
    for i in list do
        printfn "The square of %d is %d" i (i * i)

squares [1..6]