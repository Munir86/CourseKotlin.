// variables scope عمر المتغيرات / نطاق المتغيرات

/*
fun com.munir.packag.main(args: Array<String>) {
// هذا المتغير لوكال خاص فقط في هذه function
    var name="munir"
}

fun show(){

// نلاحظ في الطباعة يقول هناك خطا لانه لم يتم التعرف على name ولانها معرفة داخل function الثانية لذلك لايمكن الوصول اليها
//اذا هذا block لايمكن له رؤية مجتوى ال block  الاخر لانه المتغير خاص وليس public
    println(name)

}
 */

/*
في هذا المثال لوضعنا المتغير بشكل عام public اي قبل كل من functions
 */
//هنا يتم وضع المتغير قبل الدالة ليتم التعرف عليها بشكل public اي بشكل عام


/*
// متغير عام public

var name="munir"


fun  com.munir.packag.main(args: Array<String>) {
    println(name)
    println(age)

}

fun show(){

   // هنا المتغير age غير معرف في ال public لذلك لايمكن لنا ان نطبعها كما في حالة name عندما يكون معرف في public
    var age=20

    println(name)


}
  */



/*
    المتغير الي يتم  تعريفه داخل ال method هو متغير    private
 سوف يولد عندما تشتغل ال method عندما تنتهي ال method ٍ سوف تنتهي حياة المتغير نلاحظ ان ال كاربج كولكشن مسحها من الذاكرة
 لانه غير معروف بالنسبة لبعضهم
     */
var name="munir"


fun  main(args: Array<String>) {
    println(name)
    show()

}

fun show(){

    var age=20
    println(name)
    println(age)


}