package com.company.Easy


fun main(){
    val array = intArrayOf(0,0,1,1,1,2,2,3,3,4)
    println(removeDuplicates(array))
}
fun removeDuplicates(nums: IntArray): Int {
    var set = mutableSetOf<Int>()
    for (element in nums){
        set.add(element)
    }
    for ((i, element) in set.withIndex()){
        nums[i] = element
    }
    println(nums.joinToString())
    return set.size
}
