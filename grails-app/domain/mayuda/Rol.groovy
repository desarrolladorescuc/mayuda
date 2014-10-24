package mayuda

class Rol {

    String rol
    
    static belongTo = [login:Login]
    
    static mapping = {
        table'roles'
        version false
    }
    
    static constraints = {
        rol blank:false, nullable:false, maxSize:150
    }
}
