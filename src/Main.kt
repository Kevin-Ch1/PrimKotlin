fun main(){

    /*
    println("Hello World")

    //variables
    //var(mutables-cambian) y val(inmutables-no combia)

    //Toda variable debe ser inicializada
    //Formal
    val num1: Int = 10
    //Acortado
    val edad = 20


    var num2: Int
    var precio = 10.0
    precio = 20.0

    val nombre1: String = "Hola Kotlin"
    val ed: Int = 20
    val num: Double = 1.65
    val boolean: Boolean = true
    val peso: Float = 12.25f
    val inicial: Char = 'A'

    //Operadores(+,-,*,/,%)
    val numA = 10
    val numB = 20
    val total = numA + numB
    //println("La suma es: " + total)
    println("La suma es: $total")

    //Ingreso de datos por teclado
    print("Escribe tu nombre: ")
    val nombre = readln()
    print("Escribe tu apellido: ")
    val apellido = readln()
    println("La persona con nombre $nombre y apellido $apellido ha ingresado al sistema")

    println("Ingrese un número:")
    val a = readln().toInt()
    println("Ingrese otro número: ")
    val b = readln().toDouble()
    val c = a+b
    println("La suma es: $c")

    //Estructuras de Control
    //if
    val number = 5;
    if(number % 2 == 0){
        println("El número es par")
    }else{
        println("El num es impar")
    }
    //if anidado
    if(number > 7){
        println("Aprobó la materia")
    }else if((number >= 5) and (number >= 7)){
        print("Supletorio")
    }else{
        print("Pierde la materia")
    }

    //Switch
    val opcion = 1;
    when(opcion){
        1 -> print("Uno")
        2 -> print("Dos")
        3 -> print("Tres")
        else -> print("Ingrese los números del 1 al 3")
    }
    */
    //for

    for(i in 1..5){
        println(i)
    }

    for(i in 10 downTo 1){
        println(i)
    }

    println("For 4")
    for(i in 1..10 step 4){
        println(i)
    }

    println("For 2")
    for(i in 10 downTo 1 step 2){
        println(i)
    }

    //while
    println("While")
    var i = 1
    while (i <= 10){
        println(i)
        i++
    }

    //do-while

    println("Do-While")
    var j = 0

    do{
        println(j)
        j++
    }while (j <= 10)


    //Vectores y arreglos

    //Vectores

    val numeros = IntArray(3)
    numeros[0] = 1
    numeros[1] = 2
    numeros[2] = 3

    val numeros2 = intArrayOf(10,20,30)

    for (i in numeros2.indices){
        println(numeros2[i])
    }

    //Arreglos
    val matriz1 = Array(2){IntArray(3)}

    val matriz2 = arrayOf(
        intArrayOf(1,2),
        intArrayOf(3,4),
        intArrayOf(5,6),
    )

    //acceder un elemento
    println(matriz2[0][0])
    println(matriz2[2][0])

    //Recorrer un arreglo
    for(i in matriz2.indices) {
        for(j in matriz2[i].indices){
            println("${matriz2[i][j]}")
        }
        println()
    }



}