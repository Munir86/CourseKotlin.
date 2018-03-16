// العبارات الشرطية  When condition

fun main(args: Array<String>) {
       print("Enter Number:")
    val number:Int= readLine()!!.toInt()
    when(number){
        1->{
            print("you enter 1")
        }
        2->{
            print("you enter 2")
        }
        3,4->{
            print("you enter 3 or 4")
        }
        // هنا يعني من الرقم من بين 10 لل 30 كمثال
        in 10..30-> {
            print("you between 10 to 30 ")
        }
        // هنا يعني الرقم ليس من 10 لل 30 كمثال
        !in 10..30->{
            print("you not  between 10 to 30 ")
        }
        else->{
            print("out of range ")
        }

    }

    println("END APP")

}