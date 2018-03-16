//WhileDoWhileLoop العبارات التكرارية
// هذه العبارات نفس فورب ولكن هناك طريقة اخرى لتمثيل اللوب
//
fun main(args: Array<String>) {
//مثال القديم على فور لووب
    /*
    for (count in 1..4){
        println("hello")
    }
    */
// في هذا المثال سوف نسخدم while loop
   /*
    var count=1
    while (count<5){
        //block of code
        println("hello")
        count=count+1
    }
    */

    //في هذا المثال سوف نسخدم العدد الفردي
/*
    var count=1
    while (count<10) {
        //block of code
        println("count:$count hello")
        count = count + 2
    }
  */

    // ماذا لو اردنا ان نستخدم الاعداد الزوجية بدل الفردية لنتابع المثال مع بعضنا
    /*
    var count=0
    while (count<10) {
        //block of code
        println("count:$count hello")
        count = count + 2
    }
    */
/*
ملاحظة هناك نوع اخر من loop الاوهو DO While
الفرق الوحيد بين while و Do while
ال While لايقوم بتنفيذ الكود اذا الشرط  لم يتحقق

 */
//  *********مثال على While في حالة الشرط لا يتحقق ***********

    var count=101
    while (count<10) {
        //block of code
        println("count:$count hello")
        count = count + 2
    }
/*
هذا المثال على دو وايل
هنا يقوم بتنفيذ العمليه (طباعة  )ومن ثم ينتقل الى الشرط
 */
     count=101
    do {
        //block of code
        println("count:$count hello")
        count = count + 2
    }while (count<10)


    println("end app")

}