def absolute(x: Double) = if (x>=0) x else -x

def doesItSuffice(guess: Double, x: Double) =
  absolute(guess * guess - x) /x < 0.001

def betterPerform(guess: Double, x: Double) =
  (guess + x / guess)/2

def sqrt(x: Double) = sqrtIter(1.0, x)

def sqrtIter(guess:Double, x: Double): Double=
  if(doesItSuffice(guess, x)) guess
  else sqrtIter(betterPerform(guess, x), x)
