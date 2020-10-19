package io.justdoit.world

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CountryService {
    @Autowired
    var repoCountry:RepoCountry? = null

    fun deleteById(id: Int):Boolean{
        repoCountry!!.deleteById(id)
        return true
    }

    fun deleteAllCities(country: Country):String{
        repoCountry!!.delete(country)
        return ""
    }

    fun getById(id: Int):Country{
        return repoCountry!!.findById(id).get()

    }

    fun getAll(): MutableIterable<Country> {
        return repoCountry!!.findAll()
    }

    fun save(country: Country): Country {
        return repoCountry!!.save(country)
    }


}