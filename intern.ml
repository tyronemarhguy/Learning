let lst = [1;2;3;4]

let rec fold (f: int -> int -> int) (base: int) (lst: int list): int = 
  begin match lst with
  | [] -> base
  | head :: tail -> f head (fold f base tail)
end

let sum (lst: int list): int = fold (+) 0 lst

;;print_int (sum lst)