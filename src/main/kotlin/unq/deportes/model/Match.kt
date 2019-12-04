package unq.deportes.model

import java.awt.Point
import javax.persistence.*

@Entity
@Table(name = "Match")
class Match(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "ID")
        private val id: Long,
        @Column(name = "Local")
        private val local: String,
        @Column(name = "Visitante")
        private val visitante: String,
        @Column(name = "Goleslocal")
        private val golesLocal: Int,
        @Column(name = "Golesvisitante")
        private val golesVisitante: Int,
        @Column(name = "Fecha")
        private val fecha: String,
        @Column(name = "Competencia")
        private val competencia: String,
        @Column(name = "Instancia")
        private val instancia: String
)

{
    private constructor() : this(0, "", "",0,0,"","","")
    fun getId(): Long = id
    fun getLocal(): String = local
    fun getVisitante(): String = visitante
    fun getGolesLocal():Int = golesLocal
    fun getGolesVisitante():Int = golesVisitante
    fun getFecha():String = fecha
    fun getCompetencia():String = competencia
    fun getInstancia():String = instancia
}