-- The following creates a list of numbers, then outputs the length of the list as HTML text.

import Html exposing (text)

numbers =
  [1,2,3,4,5]

main =
  text ("There are " ++ String.fromInt (List.length numbers) ++ " numbers in the list.")