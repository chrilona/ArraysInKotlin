fun main(){
    takeStrings(arrayOf("ruth","naomi","lona","keenganju"))
    towns()
    digits()
    println(takeIn().contentToString())
}
fun takeStrings(name:Array<String>){
    println(name.contentToString())
}
fun towns(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
     cities.forEach { cities->
         println(cities.capitalize())
     }
}
fun digits(){
    var numbers =  arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1]+numbers[4])
    println(numbers.indexOf(158))
    var ascends = numbers.sortedArray()
println(ascends.contentToString())
}
fun takeIn(): Array<String> {
    return arrayOf("money", "more money", "money again")
}