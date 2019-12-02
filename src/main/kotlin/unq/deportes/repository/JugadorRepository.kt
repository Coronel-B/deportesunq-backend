package unq.deportes.repository

import org.springframework.data.repository.CrudRepository
import unq.deportes.model.Jugador
import unq.deportes.model.Team

interface JugadorRepository  : CrudRepository<Jugador, Long> {
    fun findByEquipo(team: Team):List<Jugador>
}