package com.munir.packag


interface op{
    fun sum(n1:Double,n2:Double)
    fun sub(n1:Double,n2:Double)
}


class UserOp: op {
    override fun sum(n1: Double, n2: Double) {
        println(n1+n2)
    }

    override fun sub(n1: Double, n2: Double) {
        println(n1-n2)
    }

}

class AdminOp: op {
    override fun sum(n1: Double, n2: Double) {
        println(n1+n2+10)
    }

    
    override fun sub(n1: Double, n2: Double) {
        println(n1-n2-10)
    }

}
