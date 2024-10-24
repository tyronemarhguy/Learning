let lst = [1;2;3;4;5;6;7;8;9;10]

let find_odd (lst: int list): int list = 
  let odd_lst: int list = 
    let rec helper (lst: int list): int list = 
      begin match lst with
      |[] -> []
      |head :: tail -> if head mod 2 = 1 then head :: helper tail else helper tail
    end
in
helper lst 
in  
odd_lst

;;print_endline (string_of_bool (find_odd lst = [1;3;5;7;9]))