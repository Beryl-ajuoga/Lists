import java.awt.Color

fun main(){
    var shade = Color(listOf("red","blue","green","black","white","grey","orange"))
    println(shade)

    var x=height(listOf(45,60,62))
    println(x)

    var Emma = person("Emma",19,45,50)
    var Zora = person("Zora",22,60,88)
    var Paul= person("Paul",16,62,100)

    var people = listOf(Emma,Zora,Paul)
    var adults = people.sortedByDescending { p -> p. age}
    println(adults)

    var lucy = person("lucy",3,120,15)
    var jully = person("jully",6,170,17)

    var list = mutableListOf(lucy,jully)
    println(people.plus(list))

    var audi = Car("KWD705",40)
    var volvo = Car("KWT605",60)
    var wish = Car("QFT254",20)

    var myCars = listOf(audi,volvo,wish)
    println(covarage(myCars))

}

fun Color(paint: List<String>):List<String> {
    paint.forEachIndexed { index, Color ->
        if ((index % 2) == 0) {
            println(Color)

        }
    }
    return paint
}




fun evenvalues(paint:List<String>):List<String>{
    var color= mutableListOf<String>()
    color.forEachIndexed { index, s ->
        if (index %2 ==0){
            color.add(s)
        }
    }
    return color
}

fun height(numb:List<Int>):String {
    var heights = numb.sum()
    var meters = numb.average()
    var total = "$heights,$meters"

    return  total
    println(total)
}

data class person(var name:String, var age:Int,var height:Int, var weight:Int)


fun individual(individuals:List<Any>):List<Any>{
    return listOf()
}



data class Car(var registration: String, var mileage: Int)



fun covarage(numbs:List<Car>):Int {
    var mile = 0
    numbs.forEach { m -> m.mileage
        mile += m.mileage
    }
    var  miles = mile/numbs.count()
    return miles
}






