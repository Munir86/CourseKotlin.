// Overriding الهيمنة
/*
  مفهوم التجازو  override هي من اكثر المفاهيم  اللي راح تشوفها بشكل كثير في الاندرويد
   ماهو override لو عنا method في كلاس الاب ورثها الابن في كلاسه لكن هذا الكلاس يريد ان يعمل different implementation
 لل sub لانه هوا ايضا يملك sub لكن ال sub اللي عندها يختلف عن اللي عند الاب
 كمافي مثالنا هنا نطرح رقمين ولكن في الابن الوريث ايضا نطرح ولكن اجمع معها ال 10
 طبعا حتى يتم التنفيذ اولا نقوم باضافة open امام method الاب ال function اللي اسمها sub كما في المثال
 اما في method كلاس الوريث نضع امام function كلمة ال override
  اذا بهذه الطريقة صحيح انه ورث الكلاس ولكن method الاب ثابتة في الوريث لا اريدها ان تبقى على حالها كما في مثالنا هذا
  لذلك قمنا بتغير المحتوى method الوريث بالطريقة التي نريدها نحن
  ماذا لو قلنا انه في كلاس الوريث اريد استدعاء كلاس ال sub من الاب
  بهل حالة الشي يلي داخل الكلاس الواحد ممكن اوصللها بكلمة
   this.
   لكي اصل لكلاس الاب لازم احط كلمة
   super.
   ومن ثم اسم method


 */




open class Operationso{
    fun sum(n1:Double,n2:Double):Double{
        return n1+n2
    }
   open fun sub(n1: Double,n2: Double):Double{  // هنا نضع امام كلمة open
        return n1-n2
    }
}
class MulOperationso():Operationso(){
    fun div(n1:Double,n2:Double):Double{
        return n1/n2
    }
    fun mul(n1: Double,n2: Double):Double{
        return n1*n2
    }
    override fun sub(n1: Double,n2: Double):Double{ // هنا نضع اما function كلمة override
       super.sub(n1, n2) // بكلمة super يمكنني الوصول الى كلاس الاب اما اذا كان نفس الكلاس يمكن الوصول بكلمة this.
        return n1-n2+10
    }
}
fun main(args: Array<String>) {
    var op=Operationso()
    println(op.sum(10.0,12.0))
    println(op.sub(10.0,12.0))

    var mulop=MulOperationso()
    println(mulop.sum(10.0,12.0))
    println(mulop.sub(10.0,12.0))
    println(mulop.div(10.0,12.0))
    println(mulop.mul(10.0,12.0))
}
