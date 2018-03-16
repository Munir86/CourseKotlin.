import java.time.Year
import java.util.*

fun main(args: Array<String>) {
    //بيانات تدخل
    // input
    print("Enter your year of birth:")
    // نتوقع ان الشخص يدخل بيانات السنة التي ولد بها
    var yearOfBirth:Int= readLine()!!.toInt()

    //العمليات الجارية الحساب
    //process
    /*
      هنا نحتاج الى دالة خالة ال وهي
       var هنا اسم المتغير =Calendar.getInstance().get(Calendar.هنا تضع السنة الشهر الدقائق كما في المثال )
     هذه الدالة خاصة بلغة الكوتلن تقوم لنا بجلب الكود
     الخاص بتوقت الكمبيوتر الخاص بنا سواء كانت سنة او شهر او يوم او دقائق از ثواتي في المثال موضح بشكل افضل
     */
    var year=Calendar.getInstance().get(Calendar.YEAR)
    var month=Calendar.getInstance().get(Calendar.MONTH)
    var day=Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
    var hours=Calendar.getInstance().get(Calendar.HOUR)
    var minute=Calendar.getInstance().get(Calendar.MINUTE)
    var secound=Calendar.getInstance().get(Calendar.SECOND)



    var age=year-yearOfBirth

    // بيانات تخرج بعد عملية الحساب
    //output
    println("your age $age years $month month $day days $hours hour $minute minutes $secound seconds")


}