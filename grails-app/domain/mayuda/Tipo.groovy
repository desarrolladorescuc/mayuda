package mayuda

class Tipo {

    String nombreTipo
    
    static belongTo = [incidente:Incidente]
    
    static mapping = {
        table'tipos'
        version false
    }
    
    static constraints = {
        nombreTipo blank:false, nullable:false, maxSize:150
    }
}
