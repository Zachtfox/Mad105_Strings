fun main(){
    // questions:
    val q1 = "What is the birth name if Katherine Pierce? (Full name)"
    val q2= "Who is the elder Salvatore brother? (First name)"
    val q3 = "In what year was Katerina Petrova turned into a vampire?"
    val q4 = "In what year were Stefan and Damon Salvatore turned into vampires?"
    val q5 = "Who is, in the words of Kai Parker, 'The Myth. The Legend. The baddest bitch of all'?"

    //answers:
    var a1 = "Katerina Petrova"
    var a2 = "Damon"
    var a3 = "1492"
    var a4 = "1864"
    var a5 = "Katherine Pierce"

    var score = 0
    //cannot change value of score in functions to keep score :(

    println("$q1")
    ask1(a1.toLowerCase())
    ask2(a2.toLowerCase(), q2)
    ask3(a3.toLowerCase(), q3)
    ask4(a4.toLowerCase(), q4)
    ask5(a5.toLowerCase(), q5)


}

fun ask1(a1: String): Int{
    var response1 = readLine()!!.toString()
    var res = response1.toLowerCase()
    var score1 = 0
    if (res == a1){
        println("Correct!")
        var score1 = 1
    }
    else{
        println("Incorrect.")
    }
    return score1

}

fun ask2(a2: String, q2: String): Int{
    println("$q2")
    var response2 = readLine()!!.toString()
    var res2 = response2.toLowerCase()
    var score2 = 0
    if (res2 == a2){
        println("Correct!")
        var score2 = 1
    }
    else{
        println("Incorrect.")
    }
    return score2

}

fun ask3(a3: String, q3: String): Int{
    println("$q3")
    var response3 = readLine()!!.toString()
    var res3 = response3.toLowerCase()
    var score3 = 0
    if (res3 == a3){
        println("Correct!")
        var score2 = 1
    }
    else{
        println("Incorrect.")
    }
    return score3

}

fun ask4(a4: String, q4: String): Int{
    println("$q4")
    var response4 = readLine()!!.toString()
    var res4 = response4.toLowerCase()
    var score4 = 0
    if (res4 == a4){
        println("Correct!")
        var score4 = 1
    }
    else{
        println("Incorrect.")
    }
    return score4

}

fun ask5(a5: String, q5: String): Int{
    println("$q5")
    var response5 = readLine()!!.toString()
    var res5 = response5.toLowerCase()
    var score5 = 0
    if (res5 == a5){
        println("Correct!")
        var score5 = 1
    }
    else{
        println("Incorrect.")
    }
    return score5

}

