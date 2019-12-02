package unq.deportes.repository


import org.springframework.data.repository.CrudRepository
import unq.deportes.model.Match

interface MatchRepository  : CrudRepository<Match, Long> {
}