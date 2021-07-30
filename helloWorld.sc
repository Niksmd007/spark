/*//val are immutable
val a=10
//var
var b=120

for (x<-1 to 5)
  println(x)*/

/*def squareIt(x:Int):Int= {
  x*x
}
print(squareIt(4))

//Hof
 def hof(x:Int,f: Int => Int ):Int ={
   f(x)
 }
val res=hof(3,squareIt)

//Lambda function or anonymous function
hof(3,x=>x*x*x)*/

//Data Structures
//Tuple
/*
val tuple1=("Nikhil","Kumar","Thakur")
println(tuple1._1)
println(tuple1._2)
println(tuple1._3)
*/

//List

val name=List("Nikhil","Kumar","Thakur")
println(name(0))
println(name.head)
println(name.tail)
for (i <- name)
  println(i)

//Map
val newname=name.map( (x:String) => x.reverse)
println(newname)

//Reduce
val num=List(1,2,3,4,5)
val sum=num.reduce((x:Int,y:Int )=> x+y)
val newnum=num.filter((x:Int)=>x!=3)
// "_" as placeholder for shorthand
val shortnum=num.filter(_!=5)

//Concatenate list using "++"
val num1=List(6,7,8)
val num3=num ++ num1
val rev=num.reverse
rev.sorted
val num4=num3++num
num4.distinct
num.max
num.sum
newnum.contains(3)

//MAPS
val namemap=Map("first"->"Nikhil","middle"->"Kumar","last"->"Thakur")
println(namemap("middle"))
println(namemap.contains("first"))
val exp=util.Try(namemap("Niks")) getOrElse "unknown"
