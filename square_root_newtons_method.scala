def absolute(x: Double) = if (x >= 0) x else -x

def sqrt(x: Double) = {

  def doesItSuffice(guess: Double) =

    absolute(guess * guess - x) / x < 0.001

  def betterPerform(guess: Double) =
    (guess + x / guess) / 2

  def sqrtIter(guess: Double): Double =
    if (doesItSuffice(guess)) guess
    else sqrtIter(betterPerform(guess))

  sqrtIter(1.0)
}
