let lst: int list = [1;2;3;4;5;6;7;8]

let rec sum_even (lst: int list): int = 
  let even_lst: int list = 
    let rec helper (lst: int list): int list = 
      begin match lst with
      |[] -> []
      |head :: tail -> if head mod 2 = 0 then head :: helper tail else helper tail
    end  
    in
helper lst
in
  begin match even_lst with
  |[] -> 0
  | head:: tail -> head + sum_even tail
end


;;print_int (sum_even lst)
