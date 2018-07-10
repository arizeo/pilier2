package pilier2

class SomeClass {
    fun multiply(x: Int, y: Int): Int {
        // the following is just an example
        if (x > 999) {
            throw IllegalArgumentException("X should be less than 1000")
        }
        return x * y
    }
}