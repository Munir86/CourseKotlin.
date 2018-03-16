
//العبارات الشرطية simple if

fun main(args: Array<String>) {

    print("Enter grade :")
    var grade:Int= readLine()!!.toInt()
    if (grade>=50){
        //block of code
        grade=grade+5
        println("You Pass OF THIS  exam" )
        println("you get 5 mew grades more you new grads is $grade" )
    }else{
        //block of code
        if (grade>=45){
            grade=grade+5
            println("you get 5 mew curve more you new grads is $grade" )
            println("You Pass OF THIS  exam afte add 5 grade")
        }else{
        println("you fial")
        }
    }

    println("END APP")
}