package mbds_grails_22_23

class Role {

    String libelle

    static hasMany = [users: User]
    static belongsTo = User

    static constraints = {
    }
}
