//inner  && nested class كلاسات متداخلة
/*
رح نشتخدم مفهموم inner class و nested class
لنكون التمارين الخاصة تبعنا حتى نشوفها بل الاندرويد مانستغرب
 */

/*
// exam1 nested class  كلاس داخل كلاس
class Outer{
    val name:String="Munir"
     //هنا كلاس اخر داخل كلاس //
    class Inner{
      //هذا الكلاس في دخلها method //
        fun getMsg():String{
            return "welcome to Kotlin"
        }
    }
}
// راح يكون عنا كلاسات متداخلة بشكل مستمر وكل كلاس لها method و  properties خاص لحالو
fun main(args: Array<String>) {
    val out=Outer()
    val inner=Outer.Inner()
    println(inner.getMsg())

}
*/


// EXAM 2 inner class  كلاس داخلي

class Outer{
    val name:String="Munir"

   inner class Inner{             //هنا نحط inner
        fun getMsg():String{
            return "welcome to Kotlin"
        }
       /*
        ماذا لوكان هذا الكلاس يريد ان يصل الى بياناتا كلاس outer حتى يقدر يوصل
        لبيانات هذا الكلاس نحط قدامها كلمة inner
        */

        fun getname():String{
            return "name"
        }
    }
}

fun main(args: Array<String>) {



}