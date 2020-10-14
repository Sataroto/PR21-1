import java.io.File

public class Tokenizador{
    var tokens : MutableList<Patron> = mutableListOf<Patron>()

    constructor(src :String, seleccion: Array<Int>){
        var lines : List<String> = File(src).readLines()
        lines.forEach { line ->
            if(!line.equals("")) {
                var muestra: Array<String> = line.split(",").toTypedArray()
            }
        }
    }
}