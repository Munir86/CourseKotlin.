/*
Operations  rules | Priorites rules
الاسبقيات في العمليات الرياضية وترتيبها

1.  ()
2.  ^
3.  *,/
4. +.-
5.  =

 */

fun main(args: Array<String>) {

    val n1=20
    val n2=10
    val n3=3
    var sum:Int?=null
    sum=(n1+n2)*n3-3
    println("sum=$sum")
//مثال اخر
    sum=n1+n2/(n3-5)
    println("sum=$sum")
//مثال اخر
    sum=n1+(n2/n3)
    println("sum=$sum")


}