let lst: int list = [1;1;2]

let fib_lst: int list = 
  let rec fib (lst: int list): int list = 
    begin match lst with
    |[] -> []
    |head :: hd :: tail  -> (head + hd) :: fib (hd :: lst)
    |head :: tail -> [head]
  end
in
  fib lst