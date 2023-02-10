fun main(){
    personName("John")
    var y = addition(405, 398, 786, 843)
    println(y)
    var z=modulus(100, 3)
    println(z)
    aboutMe("like riding a bicycle.")

}
fun personName(name: String){
    println("Hello $name")
}
fun addition(num1 :Int, num2:Int, num3: Int, num4: Int ):Int{
var sum=num1+num2+num3+num4
return sum
}
fun modulus(num1: Int, num2:Int):Int{
    var modulus= num1%num2
    return modulus
}
fun aboutMe(fact:String){
    println("I $fact")
}
