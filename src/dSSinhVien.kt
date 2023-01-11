import java.util.Random
var dssv = mutableListOf("Nguyễn Văn Á", "Hoàng Văn Nam", "Tùng Hoàng")
fun randomLop() : String {
    val lop = arrayOf ("21JIT", "21BA", "21IR")
    return lop[Random().nextInt(lop.size)]
}
fun nganhHoc(lop : String) : String {
    return when (lop) {
        "21JIT" -> "Công nghệ thông tin"
        "21BA" -> "Kinh tế"
        else -> "không thuộc ngành nào"
    }
}
fun removeSpecialWord(email : String) : String {
    val re = Regex("á|à|ả|ạ|ã|ă|ắ|ằ|ẳ|ẵ|ặ|â|ấ|ầ|ẩ|ẫ|ậ")
    val re1 = Regex("é|è|ẻ|ẽ|ẹ|ê|ế|ề|ể|ễ|ệ")
    val re2 = Regex("i|í|ì|ỉ|ĩ|ị")
    val re3 = Regex("ó|ò|ỏ|õ|ọ|ô|ố|ồ|ổ|ỗ|ộ|ơ|ớ|ờ|ở|ỡ|ợ")
    val re4 = Regex("ú|ù|ủ|ũ|ụ|ư|ứ|ừ|ử|ữ|ự")
    val re5 = Regex("ý|ỳ|ỷ|ỹ|ỵ")
    val re6 = Regex("đ")
    var email = re.replace(email, "a")
    email = re1.replace(email, "e")
    email = re2.replace(email, "i")
    email = re3.replace(email, "o")
    email = re4.replace(email, "u")
    email = re5.replace(email, "y")
    email = re6.replace(email, "đ")
    return email
}
fun gmail(lop: String) {
    for(n in dssv) {
        var hoten = n.split(" ")
        var email = hoten[hoten.size-1]
        for(i in 0..hoten.size-2) {
            email = email + hoten[i][0]
        }
        email = email.lowercase()
        email = removeSpecialWord(email)
        println(email+".${lop.lowercase()}.@vku.udn.vn")
    }
}
fun lopTheoNganh() {
    val lop = randomLop()
    println("Danh sách sinh viên: $dssv thuộc lớp $lop thuộc ngành ${nganhHoc(lop)}")
    gmail(lop)
}
fun main(args: Array<String>){
    lopTheoNganh()
}
