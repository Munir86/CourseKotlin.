// class casting التحويل بين الكلاسلات
/*
من اكثر المفاهيم اللي راح تشوفها بالاندرويد هي ال  casting
يعني راح نعمل كلاس cast ل كلاس اخر
 راح نرجع لكلاس ال Site يلي في 2 من ال methods  اللي هي sum و sub
وشفنا كلاس اخر اللي هوا mul Site اللي يحتوي على div و mul و sub
لمى اجي واحط as Site امام المتغير muSi
 عند وضعها هنا نطالب بمطابقة كلاس ال mul Site بي كلاس الSite
 يقوم بمقارنة method وراح يشوف انو sum هوا اصلا ورثها من الاب
 وراح يشوف sub يلاحظ بانها مختلفة لذلك سوف يقوم باخذ محتوى sub في الابن ويحطها بالاب لانه نحنا عملنا لها عملية التحويل casting
 ويتابع عملية البحث الى ان ينتهي
 اما بالنسبة ل div و mul سوف يتم الغائها لانها اصلا غير موجودين في الاب
 باختصار انه لدينا محتوى يعمل inject ل محتوى اخر
 وبذلك عند تنفيذ التمرين نحصل على نتائج مختلفة جدا
 */
open class Site{
    fun sum(n1:Double,n2:Double):Double{
        return n1+n2
    }
    open fun sub(n1: Double,n2: Double):Double{  // هنا نضع امام كلمة open
        return n1-n2
    }
}
class MulSite():Site(){
     //fun div(n1:Double,n2:Double):Double{
   //     return n1/n2
   // }
   // fun mul(n1: Double,n2: Double):Double{
   //     return n1*n2
   // }
    override fun sub(n1: Double,n2: Double):Double{  // نضع هنا override
        super.sub(n1, n2)
        return n1-n2+9
    }
}
fun main(args: Array<String>) {
    var op = Site()
    println(op.sum(6.0, 5.0))
    println(op.sub(6.0, 5.0))

    var muSi = MulSite() as Site  // هنا قمنا بتدبيل محتوى ال Site في محتوى MulSite
    println(muSi.sum(6.0, 5.0))
    println(muSi.sub(6.0, 5.0))
   // println(muSi.div(6.0, 5.0))
   // println(muSi.mul(6.0, 5.0))
}
