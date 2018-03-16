
/*this app get user info
this app creat by Munir
وهي عبارة عن مدخلات يتم ادخال الاكزاد اليها من شاشة التنفيذ كما في مثالنا هذا
ويستعمل معاها
(redline()!!)
لكي يتم تنفيذ العبارة من الشاشة
 */
//هذه دروس الدورة التعليمة في الكوتلن المدخلات
fun main(args:Array<String>){
    print("Enter Name:")
    var name:String= readLine()!!
    println(name)

    print("Enter age:")
    val age:Int= readLine()!!.toInt()
    println(age)
    print("Enter dep:")
    val dep:String= readLine()!!
    println(dep)
    print("Enter avg:")
    val avg:Double= readLine()!!.toDouble()
    println(avg)
    print("Enter Title:")
    var title:String?=null
    title= readLine()
    println(title)

}