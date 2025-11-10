(*
    The following defines a function to create a triangle number from a
    single number and prints the result.
*)

let rec triangle n =
    if n < 1 then 0
    else n + triangle (n-1)

let () =
    let res = triangle 10 in
    Printf.printf "%d" res