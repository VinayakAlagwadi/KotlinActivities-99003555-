//Solutions for Quetions 1-10 
package com.example.kotlinActivity1

import java.util.*

1)

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Input two numbers : ")

    val a = reader.nextDouble()
    val b = reader.nextDouble()

    print("Select an operator (+, -, *, /): ")
    val operator = reader.next()[0]

    val result: Double

    when (operator) {
        '+' -> result = a + b
        '-' -> result = a - b
        '*' -> result = a * b
        '/' -> result = a / b
        else -> {
            System.out.printf("Error! invalid operator")
            return
        }
    }
    System.out.println("Result is : ")
    System.out.printf("%.1f %c %.1f = %.2f", a, operator, b, result)
}


2) 

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter radius")
    val r = reader.nextDouble()
    print("Select Area / Circumference ")
    val operator = reader.next()
    val result: String
    var p = 2* PI*r
    var sp:Double = p/4
    when (operator) {
        "Area" -> result = r.pow(2).toString()
        "Circumference" -> result = (2* PI*r).toString()
        else -> {
            System.out.printf("Error! Entered String is invalid")
            return
        }
    }
    System.out.println("$operator is  $result" )
    System.out.printf("Length of side of Square is =  %.2f" , sp )
}

3) 

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter Subject 1 marks  : ")
    val sub1 = reader.nextDouble()
    print("Enter Subject 2 marks: ")
    val sub2 = reader.nextDouble()
    print("Enter Subject 3 marks: ")
    val sub3 = reader.nextDouble()
    val total:Double = sub1+sub2+sub3
    val r = total/3
    System.out.printf("Total Marks is %.2f",total)
    println()
    System.out.printf("Percentage is %.2f", r)
}

4) 

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter quantity  : ")
    val q = reader.nextInt()
    print("Enter unit price: ")
    val p = reader.nextDouble()
    val bill:Double = q*p
    val dis = (.15*bill)
    val d = bill - dis
    var total = d
    println("Bill : $bill")
    println("Discount : $dis")
    println("Total Bill  : $total")
}


 5) 

import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter  Number: ")
    val a = reader.nextInt()
    var fac  = 1
    var factorial: (Int) -> Unit ={ a:Int -> for(i in 1..a) { fac *= i } }
    factorial(a)
    print(fac)
 }
 

6) 

fun main(args:Array<String>)
{
    val reader = Scanner(System.`in`)
    println("Enter the Size of Array: ")
    val size = reader.nextInt()
    var arr = Array(size){0}
    for (i in 0..size-1)
    {
        println("Enter the ${i+1} element in array")
        var b: Int = reader.nextInt()
        arr[i]=b
    }
    
    println("Elements in the array are:")
    for (i in arr) {
        println(i)
    }
  
    var n = arr.size
    var large =  arr[0]
  
    var l : (Int) -> Unit = { l: Int -> for (i in 1..n - 1) { if (arr[i] > large){ large = arr[i] } } }
  
    l(arr[0])
  
    println("Largest number in array is $large")
  
    var small =  arr[0]
    var s : (Int) -> Unit = { s: Int ->
        for (i in 1..n - 1) {
            if (arr[i] < small)
            {
                small = arr[i]
            }
        }
    }
    s(num[0])
    println("Smallest number in array is $small")
}

7) 

fun main(args:Array<String>)
{
    var f=0
    var s=1
    var t :Int
    var i:Int
    val reader = Scanner(System.`in`)
    println("Input number of terms to  display : ");
    var n = reader.nextInt()
    println("Here is the Fibonacci series upto  to $n terms : ");
    println(f)
    println(s)
    for(i in 3..n)
    {
        t=f+s
        println(t)
        f=s;
        s=t;
    }
}

8) 

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter a number to display prime numbers until that number : ")
    var n = reader.nextInt()
    var flag:Int
    var i : Int
    for (i in 1..n) {

        if (i == 1 || i == 0)
        {
            continue
        }
        flag = 1
        for (j in 2..i / 2)
        {
            if (i % j == 0)
            {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            println(i)
        }
    }
}


9) 

fun palindrome(n: Long): Boolean {
    var pNum = false
    var sum : Long= 0
    var temp = n
    
  while (temp > 0) {
        val r = temp % 10
        sum = sum * 10 + r
        temp /= 10
    }
    if (sum == n) {
        pNum = true
    }
  
    return pNum
}

fun main(arg: Array<String>) {
   val sc = Scanner(System.`in`)
println("Enter a number to print palindrome ")

  val number: Long = sc.nextLong()
    val list: MutableList<Long> = ArrayList()
  
  for (i in 0..number) {
        if (palindrome(i)) {
            list.add(i)
        }
    }
    println("Palindrome Numbers from 0 to $number  are : $list")
}

10)

fun main()
{
    println("Enter the year to checck leap or not")
  
    var year=Integer.valueOf(readLine())
  
    if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
    {
        println("leap year")
    }
    else
    {
        print(" Not a leap year")
    }
}
