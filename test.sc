val v1="hello"
val v2="world"
val v1="hello"
val v2="world"

var x:String="hello"

x match {
    case v1 | v2 => println("first match")
    case v1 | v2 => println("second match")
}