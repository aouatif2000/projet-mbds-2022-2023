package com.mbds.grails

class User {

    String username
    String password

    static hasMany = [annonces: Annonce]

    static constraints = {
        username blank: false, unique: true, nullable: false, minSize: 3
        password blank: false, nullable: false, minSize: 3
    }
}
