import java.io.File

public class Tokenizador{
    var tokens : MutableList<Patron> = mutableListOf<Patron>()

    constructor(src :String){
        var lines : List<String> = File(src).readLines()
        lines.forEach { line ->
            if(!line.equals("")) {
                var muestra: Array<String> = line.split(",").toTypedArray()
            tokens.add(Patron(arrayOf<Double>(muestra[0].toDouble(),muestra[1].toDouble(),muestra[2].toDouble(),muestra[3].toDouble()),muestra[4],""))
            }
        }
        println(tokens.size)
    }

    fun mindis( objetivo: String){
        tokens.forEach(){i ->
            if(i.clase.equals(objetivo)){

            }
        }
    }


}
fun main(){
    var ruta = "src/recursos/iris.data"
    var fuente = Tokenizador(ruta);
}