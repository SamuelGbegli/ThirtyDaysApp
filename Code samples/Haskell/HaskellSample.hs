-- The following code defines a function to return the sum of 2 integers,
-- then prints the result of the function

add :: Int -> Int -> Int
add x y = x + y

main = do
    print (add 2 4)