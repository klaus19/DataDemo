
fun main(){

    open class ParentClass{

        var var1 = false
        var var2:String?=null
    }

    data class ChildClass(
        var var3:Long
    ):ParentClass()

}