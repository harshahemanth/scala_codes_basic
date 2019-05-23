def gcd(a: Int, b: Int): Int =
  if (b==0) a else gcd(b, a % b)

//gcd(25, 5)
/*Here you call gcd function again at the end so it's recursive
 step 1 : if (5 == 0) 25 else gcd (5, 25 % 5)
 step 2 : if (false) 25 else gcd (5, 25 % 5)
 step 3 : gcd (5, 25 % 0)
 step 4 : if ( 0 == 0) 5 else gcd (0, 5 % 0)
 step 5 : 5
*/
/* If a function calls itself as it's last action,
function's stack frame can be reused. This is called
tail recursion
*/
def factorial(num: Int): Int =
  if (num == 0) 1 else num * factorial(num - 1)

//factorial(5)
/*
