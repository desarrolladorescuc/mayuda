package mayuda

class Estado {

    String nombreEstado
    
    static belongTo = [incidente:Incidente]
    
    static mapping = {
        table'estados'
        version false
    }
    
    static constraints = {
        nombreEstado blank:false, nullable:false, maxSize:150
    }
}
