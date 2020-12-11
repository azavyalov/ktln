package koans.properties

class LazyProperty(val initializer: () -> Int) {
    var value: Int? = null
    val lazy: Int
        get() {
            if (value == null) {
                value = initializer()
            }
            return value!!
        }
}

fun main() {
    val lazyProperty = LazyProperty { 5 * 2 }
    println(lazyProperty.lazy)
}