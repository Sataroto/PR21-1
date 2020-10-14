import java.io.File

public class Tokenizador{
    var tokens : MutableList<Patron> = mutableListOf<Patron>()

    constructor(src :String){
        var lines : List<String> = File(src).readLines()

    }
}