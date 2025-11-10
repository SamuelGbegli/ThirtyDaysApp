# The following code creates an array of birthstones, iterates
# through the array and prints each item's value and array index

# Birthstones are taken from https://www.gemsociety.org/article/birthstone-chart

birthstones = ["garnet", "amethyst", "aquamarine",
"diamond", "emerald", "alexandrite",
"ruby", "peridot", "sapphire",
 "tourmaline", "topaz", "blue topaz"]

 print "birthstones:\n"
 birthstones.each {
   |birthstone| print birthstones.find_index(birthstone), " is ", birthstone, "\n"
 }