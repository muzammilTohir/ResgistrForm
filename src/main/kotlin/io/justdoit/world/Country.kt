package io.justdoit.world

import javax.persistence.*

@Entity
class Country{
    @Id
    @GeneratedValue
    val id:Int = 0
    val nameCountry:String? = null
    @OneToMany(cascade = arrayOf(CascadeType.ALL))
    //@JoinColumn(name="cId",referencedColumnName = "id")
    private var cities: List<Cities?> = TODO()
}