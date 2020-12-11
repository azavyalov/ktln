package koans.introduction

fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }