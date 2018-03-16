// hash map  هاش ماب
/*
احد اكثر انواع ال data structure اللي نستخدمها في التعامل مع network هي hashmap
ال هاش ماب يعني انو نخزن الداتا بشكل مفتاح وقيمة
 */

fun main(args: Array<String>) {
/*
    var map=HashMap<Int, String>()

    map.put(1, "Muir")
    map.put(5, "berivan")
    map.put(10, "adam")
    map.put(45, "Max")

    println(map[45])

*/
    // مثال اخر لجلب key معين
    /*
    var map=HashMap<Int, String>()

    map.put(1, "Muir")
    map.put(5, "berivan")
    map.put(10, "adam")
    map.put(45, "Max")

    println(map[1])

    */

    // ماذا لو اردت احدث قيمة berivan تابع المثال التالي

    var map=HashMap<Int, String>()

    map.put(1, "Muir")
    map.put(5, "berivan")
    map.put(10, "adam")
    map.put(45, "Max")

    map[10]="adam ahmed"  // update

   for (key in map.keys){
       println(map[key])
   }


}
