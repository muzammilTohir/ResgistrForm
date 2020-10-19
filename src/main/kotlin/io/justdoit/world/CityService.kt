package io.justdoit.world

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.persistence.Id

@Service
class CityService {
    @Autowired
    var repoCity:RepoCity? = null

    fun deleteById(cityId: Int):Boolean{
        repoCity!!.deleteById(cityId)
        return true
    }

    fun deleteAllCities(cities: Cities):String{
        repoCity!!.delete(cities)
        return ""
    }

    fun getById(cityId: Int):Cities{
        return repoCity!!.findById(cityId).get()

    }

    fun getAll(): MutableIterable<Cities> {
        return repoCity!!.findAll()
    }

    fun save(cities: Cities): Cities {
        return repoCity!!.save(cities)
    }


}