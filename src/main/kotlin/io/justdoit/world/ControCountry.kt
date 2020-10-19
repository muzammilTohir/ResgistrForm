package io.justdoit.world

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
@RestController
@RequestMapping("/country")
class ControCountry {

    @Autowired
    private val countryService: CountryService? = null

    @GetMapping("/{id}")
    fun getByIdCity(@PathVariable id: Int): Country {
        return countryService!!.getById(id)
    }

    @GetMapping
    fun getAllCity(): MutableIterable<Country> {
        return countryService!!.getAll()
    }

    @DeleteMapping("/{id}")
    fun deleteByIdCity(@PathVariable id: Int): String {
        countryService!!.deleteById(id)
        return ""
    }

    @DeleteMapping
    fun deleteAllCity(@RequestBody country: Country): Boolean {
        countryService!!.deleteAllCities(country)
        return true
    }

    @PostMapping
    fun saveNewCity(@RequestBody country: Country): Country {
        return countryService!!.save(country)
    }
}