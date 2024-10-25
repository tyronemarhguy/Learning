let lst: int list = [1;2;3;4;5]

let rec sum = function
  [] -> 0
  |head :: tail -> head + sum tail 