package io.justdoit.world

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Cities{
    @Id
    @GeneratedValue
    val cityId:Int = 0
    val nameCity:String? = null

}