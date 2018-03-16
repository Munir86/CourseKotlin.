// Visibility Modifiers مدى المتغيرات
/*
في هذا الدرس سوف نتطرق الى الوصول للمتغيرات او مدى الوصول الى المتغيرات او الدوال
في هذا المثال لدينا الكلاسينOperations1 و MulOperations1 كل منهما يحتوي 2 من functions
لكن عندما ورث MulOperations1 من Operations1 استطاع الوصول الى جميع ال function الموجودة في الاب اللي هي Operations1
لماذا لانها هي اصلا بالاساس معرفة by default بابليك public اي بمعنى يعني يمكن الوصول الها من اللي ورثها او يمكن الوصول لها من com.munir.packag.main methods
هذه بالنسبة ل public
ماذا لو اردت انو هل function اريد ان اصل لها واللي يورثني يوصللها ومااريد حدا يوصللها بشكل مباشر اعرفها Protected
انا من داخلي مممكن اوصللها ويلي يورثني يوصللها بس من com.munir.packag.main method لايمكن الوصول اليها اذا نسميها protected
اما بالنسبة لحالة private يمكن الوصول اليها من داخلي ولايمكن الوصول من الوريث ,ولا حتى من com.munir.packag.main method

 */

open class Operations1{
    //EXAM 1
    public var process="com.munir.packag.main process"  // by default public
    //EXAM 2
    protected var site="com.munir.packag.main site " // يمكن الوصول لها من كلاسي والكلاس اللي يورني ولايمكن الوصول لها من com.munir.packag.main method
    //Exam 3
    private var home="Myhome" // فقط يمكن الوصول لها من كلاسي ولايمكن الوصول للوريث ولا حتى com.munir.packag.main method

    fun sum(n1:Double,n2:Double):Double{
        return n1+n2
    }
    fun sub(n1: Double,n2: Double):Double{
        return n1-n2
    }
    fun myprocess(){
        println(process)  // يمكن الوصول للكل
    }
    fun mysite(){             // يمكن الوصول فقط من كلاسي والوريث
        println(site)
    }
    fun myhome(){           // يمكن الوصول من كلاسي فقط
        println(home)
    }
}
class MulOperations1():Operations1(){
    fun div(n1:Double,n2:Double):Double{
        return n1/n2
    }
    fun mul(n1: Double,n2: Double):Double{
        return n1*n2
    }
    fun parentprocess(){  // public  يمكن الوصول
        println(process)
    }
    fun parentSite(){    // يمكن  لكلاسي وكلاس للوريث الوصول protected
        println(site)
    }
    /*
    fun parenthome(){  // لايمكن  الوصول اليها private
        println(home)
    }
    */
}
fun main(args: Array<String>) {
    var op=Operations1()
    op.process="com.munir.packag.main process"   // يمكن الوصول لها public
    /*
    com.munir.packag.op.site="com.munir.packag.main site"   // لايمكن الوصل لها من هنا protected
    com.munir.packag.op.home="Myhome"    // لا يمكن الوصول نهائيا private
    */
    println(op.sum(10.0,12.0))
    println(op.sub(10.0,12.0))

    var mulop=MulOperations1()
    println(mulop.sum(10.0,12.0))
    println(mulop.sub(10.0,12.0))
    println(mulop.div(10.0,12.0))
    println(mulop.mul(10.0,12.0))
}
