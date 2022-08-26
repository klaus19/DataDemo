interface Base_Interface{
    val item:String
}
interface Derived_Interface : Base_Interface {
    val derived_item:String
}

fun main(){

    data class B(override val item: String):Base_Interface

    data class D(override val derived_item:String,
                 private val b:Base_Interface) :  Derived_Interface, Base_Interface by b
    val b = B("Hello ")
    val d = D("World!", b)

    print(d.item) //from the base class
    print(d.derived_item) //from the derived class



}