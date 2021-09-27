fun main () {

    var numeroVentanas=4;
    var numeroPisos=10; ;

    println(crearRascacielos(numeroPisos,numeroPisos))
}

fun crearRascacielos(numeroPisos : Int, numeroVentanas: Int) : String {

    var resultado: String = ""

    repeat(numeroVentanas*3+2) {
        resultado+=("_");
    }

    resultado+=("\n")

    repeat(numeroPisos) {
        resultado+=("|")

        repeat(numeroVentanas) {

            resultado+=("_▋_")

        }

        resultado+=("|")
        resultado+=("\n")


    }
    return resultado
}