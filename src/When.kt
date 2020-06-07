fun main() {
    var name:String? = null
    //var name:String? = "Pradeep"
    //var name:String? = "Kumaresan"
    when(name) {
        null -> println("Hi")
        "Pradeep" -> println("Pradeep")
        else -> println(name)
    }
}
