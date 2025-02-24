//This program is to help anybody pick something if they need help.  //Two modes - coin flip, and picking from a list to choose names or something.
import kotlin.random.Random
import kotlin.system.exitProcess

//TODO fix the top level declaration issue.
val pickerList = mutableListOf<String>()
val numpickerlist = mutableListOf<Double>()

fun main(){
    while (true){
    menu()
    }
}

fun menu(){
    println("Welcome to Yeshua's helper!")
    println("1. Coin Flip")
    println("2. Name picker")
    println("3. Random Number Generator")
    println("4. Exit")

    when(readlnOrNull()?.toIntOrNull()){
        1 -> coinflip()
        2 -> listpicker()
        3 -> randNumGen()
        4 -> exit()
        else -> println("Invalid input")
    }
}

//coin flip program, heads(0), tails(1)
fun coinflip(){
 val
}
//have them input names or numbers in a list and have the program pick one (or more) from it
fun listpicker(){

}


//maybe i can ask the user to input how many numbers they want to be generated.
fun randNumGen(){

}

//exiting the code
fun exit(){
    println("Okay, See ya! Closing program.")
    exitProcess(0)
}
