import kotlin.math.E

//1: Write a function that Adds Two Numbers
//2:Write a function that finds the square of a number
//3:Write a function that displays names
//3:Create a class employee containing the following state
//a: Name
//b: Email
//c: Company
//i(Print the output
fun main(){
     getSum(2,8)
    getSquare(9)
    getNames(arrayOf("Jane","John","Klein","Kelly"))
    var e= Employee("Vina Morales","vinamorales@gmail.com","ABS-CBN")
    println(e.Name)
    println(e.Email)
    println(e.Company)

}

fun getSum(a:Int,b:Int){
    var sum=a+b
    println(sum)

}
fun getSquare(S:Int){
    var product = S*S
    println(product)
}
fun getNames(Names:Array<String>){
    Names.forEach { name->
        println(name)
    }

}


data class Employee(var Name: String,var Email:String,var Company:String){

}