fun main(){

    val matriz1 = Array(3) { IntArray(3) }
    val matriz2 = Array(3) { IntArray(3) }
    val matriz3 = Array(3) { IntArray(3) }

    for (i in matriz1.indices) {
        for (j in matriz1[i].indices) {
            matriz1[i][j] = kotlin.random.Random.nextInt(1, 10)
            matriz2[i][j] = kotlin.random.Random.nextInt(1, 10)
        }
    }

    for (i in matriz3.indices) {
        for (j in matriz3[i].indices) {
            var sum = 0
            for (k in matriz3[i].indices) {
                sum += matriz1[i][k] * matriz2[k][j]
            }
            matriz3[i][j] = sum
        }
    }


    for(i in matriz3.indices){
        for (j in matriz3[i].indices){
        print("[${matriz1[i][j]}]")
        }
        println()
    }

    for(i in matriz3.indices){
        for (j in matriz3[i].indices){
            print("[${matriz2[i][j]}]")
        }
        println()
    }

    for(i in matriz3.indices){
        for (j in matriz3[i].indices){
            print("[${matriz3[i][j]}]")
        }
        println()
    }

}