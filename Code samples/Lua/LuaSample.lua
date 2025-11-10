
-- The following code creates a table, then iterates through the
-- table and prints each value to the console.

planets = {"Mercury", "Venus", "Earth", "Mars",
"Jupiter", "Saturn", "Uranus", "Neptune"}

print("Planets of the Solar System")
for i, v in ipairs(planets) do
    print(v)
end
