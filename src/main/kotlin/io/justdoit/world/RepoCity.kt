package io.justdoit.world

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RepoCity:CrudRepository<Cities,Int> {
}

