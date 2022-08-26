
fun main(){
    abstract class Tutorial{
        abstract var year:Int
        abstract var name:String
    }

    data class Book(
        override var year:Int=2022,
        override var name: String,
        ):Tutorial()
}

