// العبارات التكراريةFor loop
fun main(args: Array<String>) {
 /*
 هنا قمنا بطابعة الكلمة اكثر من مرة ولكن باسلوب اعتيادي ولكن في المثال
 الاسفل يقوم بطباعة الاسم ولكن بطريقة العبارة التكرارية وبكود مختصر
    println("Hello")
    println("Hello")
    println("Hello")
    println("Hello")
    println("Hello")
    */
//يتم تطبيق هذا المثال بكود افصل ويرمز لهذه الاشارة  (..) من الى اي اطبع الكلمة من 1 الى 6 كما في المثال
  /*
    for (item in 1..6){
        println("hellO")
        println("count: $item")
    }
    */
    //مثال اخر
 /*
    for (item in 1..4){
         if (item==4) {
             println("count : $item")
         }

    }
    */
    // مثال اخر في حالة لووب داخل لووب
// // في هذا المثال يوجد لدينا بلوكين كل بلوك على حدا
    // في هذا المثال  البلوك يدخل على الثاني ويكمل عداته ثم يعود للبلوك الاصلي الخاص به
 // block of code
    for (item1 in 1..5){
        //block of code
        for (item2 in 1..3) {
            println("item1: $item1, item2: $item2")
        }
    }

    println("END FOR THIS APP")
}
