//Strings السلاسل النصية

fun main(args: Array<String>) {
//في هذا المثال نطبع الرسالة في المتغير ونحدد موقع حرف معين في المتغير
/*
    var msg=" well come to NYC"
    println(msg)
    println("msg[5]="+ msg[5])


  */
    /*
    في هذا المثال يقوم بطباعة الرسالة من الصفر مطروحا من طول الرسالة لان العداد يبدا من الصفر ونلاحظ في loop
    كيف يتم طباعة الفراغ من الصفر الى احتساب طول الراسالة

     */

    var msg=" well come to NYC"
    println(msg)
    for (index in 0..msg.length-1 ) {
        println("msg[$index]" + msg[index])
    }
    /*
اذا هنا في هذا المثال يمكن ان ادمج اكثر من String بوضع علامة الجمع بيناتهم كما في المثال التالي
  ايضا يمكن وضع فارزة بينهم
toLowerCase يمكن ايضا التحويل الحوف الى الصغيرة والكبيرة عن طريق
 وايضا الى toUpperCase
 وايضا يمكن ازالة الفراغات كما في كلمة مسج باضافة .trim
 من البداية ومن النهاية في حالة وجود فراغات
 اما بالنسبةللدالة الاخيرة فهي من ال array فستخدم التقسيم ال split على الاساس الفراغات مثلا الفارزات المنقطة والى اخره
 قد نستخدم ال split كثيرا في البرمجة قد نحاول انو نقسم ال string فون نمبر اييمل ناخذ قبل الايميل وبعد الايميل و الكثير من الامور
   */

    var name="Munir"
    var msgWellcom=name+ "," +msg
    println(msgWellcom)
    println(msgWellcom.toLowerCase())
    println(msgWellcom.toUpperCase())
    println(msg)
    println(msg.trim())
    println(msgWellcom.split(" "))
    println(msgWellcom.split(","))





}