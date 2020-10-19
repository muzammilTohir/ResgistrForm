package io.justdoit.world

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cities")
class ControlCities {
    @Autowired
    private val cityService:CityService?=null

    @GetMapping("/{cityId}")
    fun getByIdCity(@PathVariable cityId:Int): Cities {
        return cityService!!.getById(cityId)
    }

    @GetMapping
    fun getAllCity(): MutableIterable<Cities> {
        return cityService!!.getAll()
    }

    @DeleteMapping("/{cityId}")
    fun deleteByIdCity(@PathVariable cityId: Int):String{
        cityService!!.deleteById(cityId)
        return ""
    }

    @DeleteMapping
    fun deleteAllCity(@RequestBody cities: Cities):Boolean{
        cityService!!.deleteAllCities(cities)
        return true
    }

    @PostMapping
    fun saveNewCity(@RequestBody cities: Cities): Cities {
        return cityService!!.save(cities)
    }
}