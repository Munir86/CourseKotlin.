
/*
التحويل بين انوع المنتغيرات بكل بساطة باستخدام  to.!!
*/
fun main(args:Array<String>){

    var strInt:String="1233"
    println(strInt)
    var intStr:Int=strInt.toInt()
    println(intStr)
    var strDouble:String="3.5"
    println(strDouble)
    var doubleStr:Double=strDouble.toDouble()
    println(doubleStr)
    var intData:Int=1234
    println(intData)
    var stringData:String=intData.toString()
    println(stringData)
    var doubleData=12.5
    println(doubleData)
/*
ملاحظة في هذا اللجزء من المثال عندما قمنا بتحويل المنغير من دوبل الى انتجر فانه
قام باهمال الجزء الاخر من النتيجة لانه الانتجر فقط هو متغير يقبل رقم ثابت وليس دوبل
بذلك وصلنا الى نقطة مهمة لا نتعلم فيها انه كيف يمكن انه نعمل تقريب للرقم او نحصل على تقريب
 */
    var intDataDouble:Int= doubleData.toInt()
    println(intDataDouble)


}