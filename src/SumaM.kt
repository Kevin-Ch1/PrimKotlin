fun main(){

    val matriz = Array(3){IntArray(3)}

    var num = 3

    for (i in matriz[0].indices){
        for (j in matriz[i].indices){
            matriz[i][j] = num++* 2
        }
    }

    val matriz2 = Array(3){IntArray(3)}
    println("Ingrese la matriz")
    for (i in matriz2[0].indices){
        for (j in matriz2[i].indices){
            matriz2[i][j] = readln().toInt()
        }
    }

    val matriz3 = Array(3){IntArray(3)}

    for (i in matriz3[0].indices){
        for (j in matriz3[i].indices){
            matriz3[i][j] = matriz[i][j] +  matriz2[i][j]
        }
    }

    for (i in matriz3.indices){
        for (j in matriz3[i].indices){
            print("[${matriz[i][j]}]")
        }
        println()
    }

    for (i in matriz3.indices){
        for (j in matriz3[i].indices){
            print("[${matriz2[i][j]}] ")
        }
        println()
    }

    for (i in matriz3.indices){
        for (j in matriz3[i].indices){
            print("[${matriz3[i][j]}] ")
        }
        println()
    }

}