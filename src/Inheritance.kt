// Class Inheritance  الوراثة من الكلاسات
/*
في هذا الدرس سوف ناخد الوراثة في البرمجة فكرتها انو class عندها method معينة وانا اريد اورث هل method
ابدا ماعمللها implement اورثها
لنفرض انه لدينا class اسمه operations ويحتوي على 2 methods كما في مثالنا هذا
 */
/*
class Operations{
//sum للجمع
    fun sum(n1:Double,n2:Double):Double{
        return n1+n2
    }
    // subtraction للطرح
    fun sub(n1: Double,n2: Double):Double{
        return n1-n2
    }
}

fun com.munir.packag.main(args: Array<String>) {
    var com.munir.packag.op=Operations()
    println(com.munir.packag.op.sum(10.0,12.0))
    println(com.munir.packag.op.sub(10.0,12.0))

}
*/

// EXAM2
/*
هنا لنفترض انه لدينا كلاس اخر واسمهMulOperations وهذا class يحتوي على 4 من methods اول اثنين الجمعsum  والطرحsub كما في المثال السابق
اما الاخرين فيكونان القسمةdiv والضرب mul
 */
/*
class Operations{
    fun sum(n1:Double,n2:Double):Double{
        return n1+n2
    }
    fun sub(n1: Double,n2: Double):Double{
        return n1-n2
    }
}
// ال class الاخر //
class MulOperations{
    fun sum(n1:Double,n2:Double):Double{
        return n1+n2
    }
    fun sub(n1: Double,n2: Double):Double{
        return n1-n2
    }
    fun div(n1:Double,n2:Double):Double{
        return n1/n2
    }
    fun mul(n1: Double,n2: Double):Double{
        return n1*n2
    }


}
fun com.munir.packag.main(args: Array<String>) {
    var com.munir.packag.op=Operations()
    println(com.munir.packag.op.sum(10.0,12.0))
    println(com.munir.packag.op.sub(10.0,12.0))
/*
بالنسبة لل instance الثاني نفس الا operation ونسميه Mulop اللهي هوا instance من MulOperations
لكن لو ركزنا بين المثالين نلاحظ ان  2 من method اللي هما الجمع sum الطرج sub
هما نفسهما بمقارنة المثالين لهذا السبب سوف نقوم بعملية الوارثة تابع المثال الذي بعد هذا
 */
    var mulop=MulOperations()
        println(mulop.sum(10.0,12.0))
        println(mulop.sub(10.0,12.0))
        println(mulop.div(10.0,12.0))
        println(mulop.mul(10.0,12.0))
}

*/

// EXAM 3
/*
هنا في هذا المثال اريد ان ارث من class ل اخر
اولا الكلاس الوريث احط : واضع اسم الكلاس المورث منو
واضع امام الكلاس اللي  راح اورث منه كلمة open لانه الكلاس by deaful يكون مغلق
وامسح method اللي كانو موجودات واخير اضع امام اسمهم ال constructor() الخاص بكل كلاس

 */
// يمكن الوراثة منه بوضع كلمة open
open class Operations{
    fun sum(n1:Double,n2:Double):Double{
        return n1+n2
    }
    fun sub(n1: Double,n2: Double):Double{
        return n1-n2
    }
}
// وضعنا اسم الكلاس الاب  ووضعنا ال constructor الخاص بكل كلاس ولم نكتب method اللي لم يعد له حاجة
class MulOperations(): Operations(){
    fun div(n1:Double,n2:Double):Double{
        return n1/n2
    }
    fun mul(n1: Double,n2: Double):Double{
        return n1*n2
    }
}
fun main(args: Array<String>) {
    var op= Operations()
    println(op.sum(10.0,12.0))
    println(op.sub(10.0,12.0))

    var mulop= MulOperations()
    println(mulop.sum(10.0,12.0))
    println(mulop.sub(10.0,12.0))
    println(mulop.div(10.0,12.0))
    println(mulop.mul(10.0,12.0))
}


