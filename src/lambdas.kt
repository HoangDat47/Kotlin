var dirtyLevel = 20
//val waterFilter = { dirty : Int -> dirty / 2}
val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}
fun increaseDirty( start: Int ) = start + 1
fun main() {
    var dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)
//    println(updateDirty(30, waterFilter))
//    println(updateDirty(15, ::increaseDirty))
}