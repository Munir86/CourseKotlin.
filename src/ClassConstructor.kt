// Class Constructor الكلاسات -البناء المختلف في الكلاس
/*
سوف نركز في هذا الدرس على constructor البناء في الكلاسات في المثال السابق اخدنا constructor وعملنالها الانشاليز للفاليو
لكن في هذا الدرس سوف نركز على constructor بطريقة اخرى تابع معي المثال عرفنا كلاس جديد
 */

class Cars {
    // هذه البارمترات تم تعريفها بشكل public لكي يمكن الوصول اليها من Method 1 وال Method 2
    var Type:String?=null
    var Model:Int?=null
    var Price:Double?=null
    var MilesDrive:Int?=null
    var Owner:String?=null
    // هذا بالنسبة للمثال السابق ال constructor وكيف عملنا لها الانشاليز للفاليو لها معرفة
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
    // هنا القسم الذي يجب علينا ان نركز عليها الدتا تايب غير معرفة بالنسبة لل constructor ونحن قمنا بادخالها
    /*
    اللي لازم نعرفه انه من الممكن هناك اكثر من constructor وانت تاخد من يلي يعجبك
    ال constructor اللي نحنا عرفناه لا يحتوي على اي نوع من فاليو الشي يلي راح اعمله انا راح حط كل هل فاليو
    يعني انا قمت بعمل انشاليز لها بطريقة اخرى تابع المثال
    الشي اللي يجب ان نفهمه من المحتل ان يكون لدينا اكثر من constructor
    لكن تحتوي كل منها على انواع مختلفة من البارامترات
    فكرة ال constructor في مثالنا هذا انه by default يتم ايجاده في حال انه لم ترسل قيم او ان الفاليو لم يحتوي على قيم
    كما في مثالنا car2
    اللي لازم تفهم من مثالنا لازم نحتوي على اكثر من constructor وتحتوي على بارمترات مختلفة ونحنا نستدعي اللي يلزمنا وبكيفنا
     */
    constructor(){
        this.Type="Taxi"
        this.Model=2020
        this.Price=2500.0
        this.MilesDrive=10
        this.Owner="Max ahmed"
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

    var Car1=Cars("BMW",2015 , 10000.0,105,"Munir")
    println("Price:" + Car1.GetPrice())
    println("Owner:"+Car1.GetOwner())

    println(" ####Enter info car 2 :#####")

    var Car2=Cars()
    println("Price:" +Car2.GetPrice())
    println("Owner:" +Car2.GetOwner())


}


