// ArrayList or linklist لنك لست
/*
احد اكثرانواع الداتا ستراكشر(Data Structure) يلي راح نستخدمها في الاندرويد هي array list
هي تشبه array لكن شي الذي يميزها عن ال array هي انه لا يحتاج انو نعرف الحجم
في ال array لايمكننا استخدمها اذا لم نضع الحجم لازم نعرف الحجم لكن يلي يميز arraylist
انه تسخدم ال (Data Structure) داتا ستراكشر liklist
وبما انو هي linklist بمعنى انه مجموعات وحدة متصلة بوحدة فلا داعي لتعريف الحجم
 */
fun main(args:Array<String>) {
/*
    var arrayList=ArrayList<String> ()
    arrayList.add("Munir")
    arrayList.add("Berivan")
    arrayList.add("Adam")
    arrayList.add("Max")

    for (item in arrayList){
        println(item)
    }
*/
    /*
     ماذا لو اردت انو احدث ال element  قيمة Adam

     */
    var arrayList=ArrayList<String> ()
    arrayList.add("Munir")
    arrayList.add("Berivan")
    arrayList.add("Adam")
    arrayList.add("Max")
    arrayList[2]="Adam Munir"

    println("(((without index))):")
    for (item in arrayList){
        println(item)
    }
    println("(((with index:)))")
    for (index in 0..arrayList.size-1){
        println(arrayList[index])
    }

    // ماذا لو استخدم البحث عن اسم معين search

    println("search by name :")
    var search= readLine()!!.toString()
    if (arrayList.contains(search)) {
        println("name is found:")
    }else {
        print("name is not found")
    }



}


