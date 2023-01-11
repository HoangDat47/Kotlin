package vku.taomail

fun inThongTin1() {
    val sv = Student("Nguyễn Văn Hoài", "21JIT")
    sv.inThongTin()
    sv.taoEmail()
    println("------------------------------------------------")
    val gv = Teacher("Nguyễn Văn Nhớ")
    gv.inThongTin()
    gv.taoEmail()
}

fun main() {
    inThongTin1()
}