# The following takes user input from the console, then prints the input
# in upper case.

echo "Type to the console, then press enter (Press Ctrl + C to exit)"
while read -r line; do
    echo "${line^^}"
done