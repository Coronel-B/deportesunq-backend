package unq.deportes.repository

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import unq.deportes.model.Competition
import unq.deportes.model.CompetitionPositions

@Repository
interface CompetitionRepository : CrudRepository<Competition, Long> {
    @Query("select new unq.deportes.model.CompetitionPositions(cp.position, t) from Team t, CompetitionDetailItem cp where cp.competitionId.id = :id and t.id = cp.team order by t.id")
    fun findDetailItemsOf(@Param("id") id: Long):List<CompetitionPositions>
}
