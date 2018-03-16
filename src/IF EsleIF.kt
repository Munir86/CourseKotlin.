// العبارات الشرطية IF ElseIf
/*
في هذا المثال من التمرين نحن نستفاد من سرعة التنفيد العملية
لانه في التمارين السابقة في كل مرة كان الكود يتم قراءته واحد تلو الاخر
اما في هذا التمرين عندما يتحقق من المطلوب يعطي النتيجة وينتهي
 */
fun main(args: Array<String>) {
    print("Enter Grade:")
    val grade:Int= readLine()!!.toInt()
    if (grade>=90){
        print("A")
    }else if (grade>=80 && grade<90){
        print("B")
    }else if (grade>=70&& grade<80){
        print("C")
    }else {
        print("you fail")
    }
}
