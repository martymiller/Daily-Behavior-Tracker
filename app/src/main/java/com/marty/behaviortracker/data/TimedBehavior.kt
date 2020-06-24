package com.marty.behaviortracker.data

class TimedBehavior(title: String) : Behavior(title) {

    var timeInSeconds: Long = 0L

    fun fizzBuzz(n: Int): List<String> =
        Array(
            n
        ) { k ->
            when {
                k + 1 % 15 == 0 -> "FizzBuzz"
                k + 1 % 3 == 0 -> "Fizz"
                k + 1 % 5 == 0 -> "Buzz"
                else -> (k + 1).toString()
            }
        }.toList()
}
