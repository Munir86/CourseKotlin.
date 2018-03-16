/*
انواع المتغيرات والتعرف عليها
 */
//this app get to user info
fun main(args:Array<String>){
//usr app print test
    var name:String="Munir"
    println(name)
    name="Munir Ahmed"
    println(name)
//val هو عبارة عن متغير ثابت عند تسميته لا يقبل ان تغيره في الذاكرة اي يبقى ذو قيمة ثابتة
    val age:Int=32
    println(age)

    val dep:String="Software Engineering"
    println(dep)

    val avg:Double=10.6
    println(avg)
//var هو عبارة عن متغير يتغير قيمته باستمرا
    var title:String?=null
    println(title)
    title="Developer"
    title="Developer in xzero"
    println(title)

}