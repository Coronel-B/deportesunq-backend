package unq.deportes.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import unq.deportes.model.BaseTest

@Repository
interface BaseTestRepository : CrudRepository<BaseTest, Long> {

    fun findByLastName(lastName: String): Iterable<BaseTest>
}