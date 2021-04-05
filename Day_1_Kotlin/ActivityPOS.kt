package com.ltts.MyActivities

import java.util.*

data class Customer(var cname:String,var mobNo : Long , var address :String){

    fun cus_details(){
        println("customer name $cname")
        println("customer moblibe number $mobNo")
        println("customer address $address")
    }

}

data class Items(var itemId:Int, var itemName :String ,var price:Double ,var quantity :Int ){

    fun item_details(){
        println("item id $itemId")
        println("Item name $itemName")
        println("Item price $price")
        println("Item quantity $quantity")
        println("Total bill ${quantity*price}")


    }
}


fun main(){

    val reader = Scanner(System.`in`)
    println("Enter Customer details")
    println("Enter Customer name")
    var cn:String=reader.next()
    println("Enter Customer mob no")
    var mob:Long=reader.nextLong()
    println("Enter Customer add")
    var add:String=reader.next()

    var c = Customer(cn,mob,add)
    println("Enter Item details")
    println("Enter item id")
    var id:Int=reader.nextInt()
    println("Enter Item name")
    var nam:String=reader.next()
    println("Enter item price")
    var p:Double=reader.nextDouble()
    println("Enter item Quantity")
    var q:Int=reader.nextInt()

    var i = Items(id,nam,p,q)
    c.cus_details()
    i.item_details()

}
