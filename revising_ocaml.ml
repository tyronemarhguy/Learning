let printer (message: string)(value: int):unit =
  print_endline(message ^": "^string_of_int(value))
let x = 7 and y = 4;

;;printer "Sum of 7 and 4 is "(x + y)

let prod = 

  let a = 9 in
  let b = 10 in

  a * b

;;printer "Product of 9 and 10 is "prod

(*implementing fibonacci *)

let rec fibo(x: int): int = 
  begin match x with
  |1 -> 0
  |2 -> 1
  |3 -> 1
  |4 -> 2
  |_ -> fibo(x-1) + fibo(x-2)
end

;;printer "1st fibonacci number is " (fibo 1)
;;printer "2nd fibonacci number is " (fibo 2)
;;printer "3rd fibonacci number is " (fibo 3)
;;printer "4th fibonacci number is " (fibo 4)
;;printer "5th fibonacci number is " (fibo 5)
;;printer "6th fibonacci number is " (fibo 6)
;;printer "7th fibonacci number is " (fibo 7)


let rec factorial(x: int): int = 
  begin match x with
  |0 -> 1
  |1 -> 1
  |_ -> x * factorial (x-1)
end

;;printer "Factorial of 4 is " (factorial 4)

let rec firstNevens(x: int): int list = 
  begin match x with
  |0 -> []
  |_ ->  firstNevens (x - 1) @ [(x * 2)]
end

let test(): bool = firstNevens 4 = [2;4;6;8]

;;print_endline(string_of_bool(test()))