fun swim(speed: String = "fast") {
    println("swimming $speed")
}
fun main() {
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter
}