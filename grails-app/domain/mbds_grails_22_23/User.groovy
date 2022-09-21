package mbds_grails_22_23

class User {

    String username

    String password

    static hasMany = [roles: Role]

    static constraints = {
        username nullable: false
    }
}
