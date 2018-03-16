// function الداول \

/*
في هذه الدرس سوف نتحدث عن function
طبعا فكرة function انه انت عندك كود معين
وهذا الكود انت اساسا تستخدمه
في اكثر من مكان فالافضل ان تضع function وتستدعيه اكثر من مكان
نلاحظ في المثال كيف قمنا بتكوين فاكشن وسميناها ب show
وقمنا باستدعائها من الدالة الرئيسية com.munir.packag.main
في هذا الفاكشن لم نقوم بدكر القيمة المعادة لها

 */
/*
fun com.munir.packag.main(args: Array<String>) {


    مثال القيمة غير معادة//

   show(10)
   show(13)
   show(22)


}
//هذا المثال في حالة تكوين الفاكشن ونتوقع انو هي تستقبل بارامتر واحد
// هنا لم يتم ذكر القيمية المعادة
fun show(number:Int){
   println("number is $number")

}
*/

// مثال اخر
    /*
    تخيل انو انت تشكل فاكش لجمع عددين

     */

fun main(args: Array<String>) {

    var sumResults=sum(10.5,12.0)
    println("sum: $sumResults")
     sumResults=sum(10.0,1.0)
    println("sum: $sumResults")
     sumResults=sum(100.0,122.0)
    println("sum: $sumResults")


    showName("Munir ahmed ")
}
// القيمية المعادة في هذا المثال Double
fun  sum(n1:Double, n2:Double):Double{

    val sumVal=n1+n2
    return sumVal    // يعيد قيمة الجمع
}
// مثال اخر
fun showName(name:String){

    println("name :$name")
}
// ملاحظة ايضا يمكن عدم وضع البارانارات في الفاكشن وتركها فارغ ايضا