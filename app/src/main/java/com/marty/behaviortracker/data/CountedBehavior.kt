package com.marty.behaviortracker.data

class CountedBehavior(title: String) : Behavior(title) {
    var count = 0

    fun increment() = count++
}