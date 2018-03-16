
//العبارات الشرطية simple if

fun main(args: Array<String>) {
/*
   // Exam1
    print("Enter Number:")
    var number:Int= readLine()!!.toInt()
    if (number>=1 && number<=100) {
        //block of code
        println( "Number Between 1- to 100 ")
    }
    println("END APP")
}
*/
   //EXAM2
     print("Enter grade :")
    var grade:Int= readLine()!!.toInt()
    if (grade>=50){
        //block of code
        grade=grade+5
    println("You Pass OF THIS  exam" )
    println("you get 5 mew grades more you new grads is $grade" )
    }
    if (grade<50){
        println("you fial")
    }

    println("END APP")
}