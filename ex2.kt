import kotlin.math.sqrt

fun triangle(a: Double, b: Double, c: Double): String {

    val p: Double = (a+b+c)/2    //nua chu vi
    val ha: Double = 2* sqrt(p*(p-a)*(p-b)*(p-c))/2
    val s: Double = 1/2*a*ha
    if(a>0 && b>0 && c>0 && (a+b>c && a+c>b && b+c>a)){
        if(a==b && b==c && a==c){
            return "Equilateral triangle"
        }
        else if (a==b || a==c || b==c){
            return "Isosceles triangle"
        }
        else {
            return "Scalene triangle"
        }
    }
    else if (a>0 && b>0 && c>0 && (a+b==c || a+c==b || b+c==a) || s==0.0){
        return "Degenerate triangle"
    }
    else{
        return "Not a triangle"
    }
}

fun main() {
    print("Sides a: ")
    val a: Double = readLine()!!.toDouble()
    print("Sides b: ")
    val b: Double = readLine()!!.toDouble()
    print("Sides c: ")
    val c: Double = readLine()!!.toDouble()

    print("This is ${triangle(a,b,c)}")
}
