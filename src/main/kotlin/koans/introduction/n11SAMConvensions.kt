package koans.introduction

import java.util.*

fun getSortedListUsingLambda(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> y -x })
    return arrayList
}