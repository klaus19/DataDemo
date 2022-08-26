

abstract class Classroom(open val teacher:String){

}

data class Tutorial(val tutorial_name:String,val year:Int):Classroom(teacher = "DSD")

fun main(arr:Array<String>){

    val tut = Tutorial("xyz",1992)
    println("Tutorial Name= ${tut.tutorial_name}")
    println("Year=${tut.year}")
    println("${tut.teacher}")
}