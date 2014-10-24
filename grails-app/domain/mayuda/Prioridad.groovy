package mayuda

class Prioridad {

    String nombrePrio
    
    static belongTo = [incidente:Incidente]
    
    static mapping = {
        table'prioridades'
        version false
    }
    
    static constraints = {
        nombrePrio blank:false, nullable:false, maxSize:150
    }
}
