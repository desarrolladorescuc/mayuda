package mayuda

import java.sql.Time

class Categoria {

    String nombreCate
    Time horaInicio
    Time horaFinal
    
    static belongTo = [incidente:Incidente]
    
    static mapping = {
        table'categorias'
        version false
    }
    
    static constraints = {
        nombreCate blank:false, nullable:false, maxSize:150
        horaInicio blank:false, nullable:false
        horaFinal blank:false, nullable:false
    }
}
