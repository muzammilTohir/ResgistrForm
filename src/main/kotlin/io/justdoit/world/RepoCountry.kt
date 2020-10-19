package io.justdoit.world

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RepoCountry:CrudRepository<Country,Int>{

}