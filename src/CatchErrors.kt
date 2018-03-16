// try catch   اقتناص الاخطاء


/*
// المثال في حالة وجود الخطأ
fun main(args: Array<String>) {
    val n1=10
    val n2=0
    val n3=12
    val sum=n1+n2+n3
    println("sum=$sum")
    val sub=n1-n2-n3
    println("sub=$sub")
    // عند الوصول الى هذا السطر يتوقف البرنامج عن العمل تمام لانه حسب المثال لايمكن التقسم على صفر  ويحدث كراش crash للبرنامج ويتوقف نهائيا//
    val div=n1/n2/n3
    println("div=$div")
    val mul=n1*n2*n3
    println("mul=$mul")
}
*/

// في حال تفادي الخطأ

fun main(args: Array<String>) {

    val n1=10
    val n2=0
    val n3=12
    val sum=n1+n2+n3
    println("sum=$sum")
    val sub=n1-n2-n3
    println("sub=$sub")
    //هنا امنع البرنامج من التوقف في حال حدوث اي خطأ
    // هنا تم محاولة تفيذ الكود في حال اذا نجح سوف يتم تنفيذه واذا فشل يظهر لي رسالة الخطأ وايضا لايتم التوقف عن العمل ولايحدث كراش crash للبرنامج
    try {
        val div=n1/n2/n3
        println("div=$div")
    }catch (ex:Exception){
        println(ex.message)
    }
    val mul=n1*n2*n3
    println("mul=$mul")
}
/*
كلمة try catch كثير مهمة وراح نستخدمها لمى في مكان ما نتوقع حدوث الخطأ
 */