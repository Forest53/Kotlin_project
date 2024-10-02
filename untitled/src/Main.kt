fun main(){
    fizzBuzz()
}
var i: Int  = 1


fun fizzBuzz() {

    while (i < 100) {
        println(i)
        i++

        if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        }
    }

}