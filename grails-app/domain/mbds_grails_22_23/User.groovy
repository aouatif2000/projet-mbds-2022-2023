package mbds_grails_22_23

class User {

    String username

    static hasMany = [roles: Role]

    static constraints = {
        username nullable: false
    }
}
