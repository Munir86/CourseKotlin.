import com.munir.packag.AdminOp
import com.munir.packag.UserOp

// class interface
/*
ماهو interface :اذا عندك مجموعة من ال methods وهذه ال methods عندها Different
implement
يعني different بناء لها مختلف الكلاسات فتستخدم interface حتى يكون عندك معروفة في كل الكلاسات
مثل الكلاس الي بي listening التصنت على GPS
في الاندرويد كل مبرمج يريد يعمل implement واحد يريد قراءة GPS ويرسل القيم للسيرفر واحد يقراها ويخزنها في الهاتف
بهل حالة هناك Interface جاهز وانت تعمللها implement بالشكل اللي يعجبك
اذا كيف يتم التعامل مع interface لاحظ المثال التالي
 */

//هنا نضع كلمة interface ونكمل هكذا
interface opi{
    fun sum(n1:Double,n2:Double)
    fun sub(n1:Double,n2:Double)
}


class UserOpi:opi{
    // نعمل implement بالشكل اللي يعجينا
    override fun sum(n1: Double, n2: Double) {
        println(n1+n2)
    }

    override fun sub(n1: Double, n2: Double) {
        println(n1-n2)
    }

}

class AdminOpi:opi{
    // نعمل implement بالشكل اللي يعجينا
    override fun sum(n1: Double, n2: Double) {
        println(n1+n2+10)
    }


    override fun sub(n1: Double, n2: Double) {
        println(n1-n2-10)
    }

}
/*
نلاحظ انه2 كلاس كل واحد عمل implement بالشكل يلي يعجبها
الشي يلي لازم تفهمها انه في الاندرويد راح تجينا كلاسات كتيرة جاهزة ونحنا نظبطها على الطريقة اللي تناسب تطبيقنا
مثل GPS , مثل ال sensor , مثل list view فيها item ,والى اخره
  */
fun main(args: Array<String>) {
    var userop= UserOp()
    userop.sum(10.5,12.5)
    userop.sub(10.5,12.5)

    var adminop= AdminOp()
    adminop.sum(10.5,12.5)
    adminop.sub(10.5,12.5)
}
