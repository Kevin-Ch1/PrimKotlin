//Primera forma
class Persona{
    var nombre: String = ""
    var edad: Int = 0
    var estatura: Double = 0.0

}

//Segunda forma
class Vehiculo(var marca:String,
                var precio: Double,
                var color: String,
                var cilindraje: Double){

    var velocidadActual: Int = 0

    //funciones

    fun encender(){
        println("El vehiculo se ha encendido")
    }

    fun apagar():String {
        return "El vehiculo se ha apagado"
    }

    fun accelerar(incremento: Int):Int{
        velocidadActual += incremento
        return velocidadActual
    }

    fun frenar(decremento: Int):Int{
        velocidadActual -= decremento
        if(velocidadActual < decremento){
            velocidadActual = 0
        }
        return velocidadActual
    }

    fun pitar(veces: Int):String{
        var sonido = ""
        for (i in 1..veces){
            sonido += "¡Beep! "
        }
        return sonido
    }

    fun mostrarDetalle(){
        println("${marca}\n${precio}\n${color}\n${cilindraje}")
    }
}

fun main(){
    val carro1 = Vehiculo("KIA",
        precio = 16000.0,
        color = "ROJO",
        cilindraje = 1.5)

    //println(carro1.marca) //get
    carro1.precio = 17000.0 //set

    carro1.encender()
    println(carro1.accelerar(4))
    println(carro1.pitar(2))
    println(carro1.frenar(4))
    println(carro1.apagar())

    carro1.mostrarDetalle()
}