//Array مصفوفات

fun main(args: Array<String>) {
/*
في هذا المثال لدي array من نوع Int
ماهي الانشيال فاليو لكل هذه العناصر احطها صفر {0}
لمى تعرف array في البرمجة يجب ان تحدد حجم ال array فمثلا 5 عناصر فنحددها بهذا الشكل (5)
عند تطبيق المثال سوف نحصل على جميع العناصر بقيمة الصفر لانه نحن قمنا بتنعينها
 */
/*
    var arrayInt=Array<Int>(5){0}
    for (index in 0..4) {
        println(arrayInt[index])
    }
*/
    //مثال اخر
    /*
    في هذا المثال ماذا لوقمنا بتحديد مثلا array لموقع رقم 2 قمنا باعطاء قيمة لها على سبيل المثال 20
     */
   /*
    var arrayInt=Array<Int>(5){0}
    arrayInt[2]=20
    for (index in 0..4) {
        println(arrayInt[index])
    }
*/
    // مثال اخر
    /*
    هناك طريقة اخرى لتنفيذ العملية بطريقة اخرى ماذا لوقلنا انه وضعنا بدال index ال item ووضعنا بدال العدد arrayInt
    وطلبنا طباعة ال item فيعطينا نفس النتائج السابقة
    بهذه تسطيع المرور على جميع عناصر ARRAY بدون استخدام index
     */
/*
    var arrayInt=Array<Int>(5){0}
    arrayInt[2]=20
    for (item in arrayInt) {
        println(item)
    }
*/
/*
  // مثال اخر
لو ادرنا ادخال العناصر array من الشاشة
 */
   /*
    var arrayInt=Array<Int>(5){0}
    for (index in 0..4) {
        print("enter element:")
        arrayInt[index]= readLine()!!.toInt()

    }

    println("list Of element:")
    for (item in arrayInt){
        println(item)
    }
*/
    // مثال اخر
/*
ماذا لو قلنا انه عناصر ال Array لو كان نوعها string ليست ارقام

 */

    var arrayStr=Array<String>(5){""}
    for (index in 0..4) {
        print("enter element:")
        arrayStr[index]= readLine()!!.toString()

    }

    println("list Of elements:")
    for (item in arrayStr){
        println(item)
    }

}