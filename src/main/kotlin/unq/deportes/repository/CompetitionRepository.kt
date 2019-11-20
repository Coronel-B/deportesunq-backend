package unq.deportes.repository

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import unq.deportes.model.Competition
import unq.deportes.model.CompetitionDetailItem

@Repository
interface CompetitionRepository : CrudRepository<Competition, Long> {
    @Query("select t.id, t.alias, t.fullName, t.position from Team t where t.competition_id = :id order by t.id")
    fun findDetailItemsOf(@Param("id") id: Long):List<CompetitionDetailItem>
}