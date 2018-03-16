/*
Simple Class- الكلاسات
EXAM Cars مثال السيارات
 */

//----------------------------

/*
 في البداية اكون اي class واسميه باي اسم اريده
وبما انه مثالنا على السيارات نسميه car
ثم نفتح قوس وادخل البارمترات التي احتاج الى تمريرها في class
في مثالنا هذا عندنا عدة بارامترات الاولى هي نوع ال car ممثلا ب type
والبارامتر الثاني هو موديل ال car ممثلا ب Model
والبرامتر الثالث سعر car ممثلا ب Price
والبارمتر الرابع هو ميل درايف ممثلا ب MileDrive
البارامتر الاخير هو مالك ال car ممثلا ب Owner
حتى اتاكد انو هل بارمترات اتمررت في class راح استخدم init
ال init هي الدالة التي تستدعى بشكل تلقائي بمجرد انو عملنا instance من ال class

 */

//-------------------------------

/*
//EXAM 1  HOW TO GET INSTANCE
class Car(Type:String,Model:Int,Price:Double,MilesDrive:Int,Owner:String){
   // هنا عملنا instance من ال class عن طريق الدالة car //
    init {
        println("Type: $Type")
        println("Model: $Model")
        println("Price: $Price")
        println("MilesDrive: $MilesDrive")
        println("Owner: $Owner")
    }



}



// نقوم بعمل instance من ال دالة car  //

fun com.munir.packag.main(args: Array<String>) {
   //  فكرة Instance كيف تم اخذها في ال car1 و car2
    println(" ####Enter info car 1:#####")
    //كار car1 هو instance من car //
    //عند تكوينها نقوم بتمرير كل البارمترا التالية في المثال bmw,2015,2015,10000.0,Munir //
    // بمجرد مادخلنا البارمترات هذه instance راح يملك جميع المعلومات اللي في car
    var Car1=Car("BMW",2015 , 10000.0,101,"Munir")
    println(" ####Enter info car 2 :#####")
    // هنا ايضا instance جديد ايضا عن car ولكن بي قيم بارمترات مختلفة نحصل على نفس النتيجة ولكن بقيم بارمترات جديدة //
    // كل object يختلف عن الثاني و class واحد فقط//
    var Car2=Car("firrari",2017,50.000,12,"Max")

}


*/

//=================================================================================

//EXAM 2
class Car {
    // هذه البارمترات تم تعريفها بشكل public لكي يمكن الوصول اليها من Method 1 وال Method 2
    var Type:String?=null
    var Model:Int?=null
    var Price:Double?=null
    var MilesDrive:Int?=null
    var Owner:String?=null
    constructor(Type:String,Model:Int,Price:Double,MilesDrive:Int,Owner:String) {
        println("Type: $Type")
        //هنا نعمل انشالايز
        this.Type=Type
        println("Model: $Model")
        //هنا نعمل انشالايز
        this.Model=Model
        println("Price: $Price")
        //هنا نعمل انشالايز
        this.Price=Price
        println("MailesDrive: $MilesDrive")
        //هنا نعمل انشالايز
        this.MilesDrive=MilesDrive
        println("Owiner: $Owner")
        //هنا نعمل انشالايز
        this.Owner=Owner
    }
    // this EXAM FOR Method 1
    fun GetPrice():Double?{
        return this.Price!! -(this.MilesDrive!!.toDouble()*10)
    }
    // this EXAM For Method 2
    fun GetOwner():String{
        return this.Owner!!

    }

}



fun main(args: Array<String>) {
    //  فكرة Instance كيف تم اخذها في ال car1 و car2
    println(" ####Enter info car 1:#####")

    var Car1=Car("BMW",2015 , 10000.0,105,"Munir")
    println("Price:" + Car1.GetPrice())
    println("Owner:"+Car1.GetOwner())

    println(" ####Enter info car 2 :#####")

    var Car2=Car("firrari",2012,1000.0,12,"Max")
    println("Price:" +Car2.GetPrice())
    println("Owner:" +Car2.GetOwner())


}
