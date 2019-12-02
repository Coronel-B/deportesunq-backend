package unq.deportes.repository

import org.springframework.data.repository.CrudRepository
import unq.deportes.model.Team

interface TeamRepository  : CrudRepository<Team, Long> {
}