fun main(){

    var contarP = 0
    var contarN = 0
    var contarC = 0
    println("Ingrese 10 números enteros")
    for(i in 1..10){
        var num = readln().toInt();
        if(num > 0){
            contarP++
        }else if (num < 0){
            contarN++
        }else if(num == 0)
            contarC++
    }


    do{
        println("Consultar numeros")
        println("1.- Números Positivos\n2.- Negativo\n3.- Cero\n4. Salir")
        var op = readln().toInt();
        when(op){
            1 -> println("Numeros positivos $contarP")
            2 -> println("Numeros negativos $contarN")
            3 -> println("Numeros Cero $contarC")
            4 -> break
        }
    }while(op*2 > 0)

}