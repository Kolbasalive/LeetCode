package com.company


fun main(){
    println(isPalindrome(-1))
}

fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    var n = countDigits(x)
    val const = n
    while(n > (const + const % 2)/2){
        if ((x / (pow(n-1)) % 10) != (x / (pow(const - n)) % 10))  return false
        n--
    }
    return true
}

fun pow(x: Int):Int{
    var f = 1
    for (i in 1..x){
        f *= 10
    }
    return f
}

fun countDigits(number: Int): Int {
    var count = 0
    var n = number
    while (n != 0) {
        n /= 10
        count++
    }
    return count
}

