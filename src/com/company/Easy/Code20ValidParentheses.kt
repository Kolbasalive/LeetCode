package com.company

fun main(){
    println(isValid("()"))
}

fun isValid(s: String): Boolean {
    if (s == "") return true
    var str = s.replace("()","").replace("{}","").replace("[]","")
    if (str == s) return false
    return isValid(str)
}


