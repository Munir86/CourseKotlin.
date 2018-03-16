import com.munir.packag.*


/*

طبعا لمى المشروع يكبر اكيد ماراح نحط كل الكلاسات في مكان واحد
بهل حالة يكون عنا عدد كبير من Packages وراح يكون ايضا package داخل package
في مثالنا عملنا ال  package
com.munir.packag
وكونا كلاس في داخل هل package وقمنا بانشاء ملفنا الحالي call package
فقمنا بعمل import كما في حالة المثال الاول بهذا الشكل
import com.munir.packag.AdminOp
import com.munir.packag.UserOp
باختصار import تعني هناك pakage فيها مجموعة كلاسات نستدعي هذه الكلاسات من هذا packag وننفذها
--------------EXAM 1-------------------
import com.munir.packag.AdminOp
import com.munir.packag.UserOp


fun main(args: Array<String>) {
    var userop= UserOp()
    userop.sum(10.5,12.5)
    userop.sub(10.5,12.5)

    var adminop= AdminOp()
    adminop.sum(10.5,12.5)
    adminop.sub(10.5,12.5)
}
*/

// ----------EXAM2-----------------------

/*
لعمل اختصار لل import نحط اسم packag من ثم بعد . * دوت ستار كما في مثلنا الثاني بهذه الطريقة
import com.munir.packag.*
بمعنى انو اجلب لي اي كلاس موجود تحت هذا packages
 */
fun main(args: Array<String>) {
    var userop= UserOp()
    userop.sum(10.5,12.5)
    userop.sub(10.5,12.5)

    var adminop= AdminOp()
    adminop.sum(10.5,12.5)
    adminop.sub(10.5,12.5)
}
