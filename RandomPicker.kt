//This program is to help anybody pick something if they need help.  //Two modes - coin flip, and picking from a list to choose names or something.
import org.w3c.dom.NameList
import kotlin.random.Random
import kotlin.system.exitProcess



val pickerList = mutableListOf<String>()
val numpickerlist = mutableListOf<Int>()

fun main(){
    while (true){
    menu()
    }
}

fun menu(){
    println("Welcome to Yeshua's helper!")
    println("1. Coin Flip")
    println("2. Name picker")
    println("3. View (RandomName)")
    println("4. Number Picker")
    println("5. View (random Numbers)")
    println("6. Random Number Generator")
    println("7. Exit")
    println("Select a number: ")

    when(readlnOrNull()?.toIntOrNull()){
        1 -> coinflip()
        2 -> pickerList.addAll(namepicker())
        3 -> viewnames(pickerList)
        4 -> numpickerlist.addAll(numpicker())
        5 -> viewNumbers(numpickerlist)
        6 -> randNumGen()
        7 -> exit()
        else -> println("Invalid input")
    }
}

//coin flip program, heads(0), tails(1)
fun coinflip(){
 val coinflip = Random.nextInt(2)
    println("Flipping a coin..")
    Thread.sleep(1000)
    if(coinflip == 1){
        println("Tails!")
    }else{
        println("Heads!")
    }

}
//have them input names or numbers (numpicker) in a list and have the program pick one (or more) from it
fun namepicker(): MutableList<String>{
val namelist = mutableListOf<String>()
var count = 0

println("How many names would you like the computer to choose from?") //so it could be more fun.
    val nameNum = readlnOrNull()?.toIntOrNull() ?: return namelist

    println("Please enter your names: ")
    while(count < nameNum){
        val userInput = readln() ?: ""
        namelist.add(userInput)
        count++
    }
    println("Names added succesfully! (Select viewnames to see the randomly picked name)")
    return namelist
}

fun viewnames(namelist: MutableList<String>){ //had to create another function to print it cause i have no idea how to print it from the original one.
    val randomname = namelist.random()
    println(randomname)
}

fun numpicker(): MutableList<Int>{
    val numlist = mutableListOf<Int>()
    var count1 = 0

    println("How many numbers would you like the computer to choose from?")
    val numNum = readlnOrNull()?.toIntOrNull() ?: return numlist

    println("Please enter your numbers: ")
    while (count1 < numNum){
        val userInput1 = readlnOrNull()?.toIntOrNull() ?: ""
        numlist.add(userInput1 as Int)
        count1++
    }
    println("Numbers successfully added! (Select viewnumbers to see the randomly picked number)")
    return numlist
}

fun viewNumbers(numlist: MutableList<Int>){
    val randomNums = numlist.random()
    println(randomNums)
}




//maybe i can ask the user to input how many numbers they want to be generated.
fun randNumGen(){
    println("Welcome to the random number generator! How many numbers do you want the generator to generate?: ")
    val ranNums = readlnOrNull()?.toIntOrNull()
    println("Awesome! Generating the numbers now...")
    Thread.sleep(1000) // i once heard that people are more satisfied with waiting for at least a little bit.
    for (i in 1..ranNums!!){
        print("${Random.nextInt(1,10)}")
    }
    println()
}

//exiting the code
fun exit(){
    println("Okay, See ya! Closing program.")
    exitProcess(0)
}
