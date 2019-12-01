package unq.deportes.model

import java.math.BigInteger
import javax.persistence.*

@Entity
@Table(name = "Team")
class Team(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "ID")
        private val id: Long,
        @Column(name = "Name")
        private val name: String,
        @Column(name = "Campeonatos")
        private val campeonatos: Number,
        @Column(name = "Entrenador")
        private val entrenador: String,
        @Column(name = "Fundacion")
        private val fundacion: String,
        @Column(name = "Url")
        private val url: String

)
{
    private constructor() : this(0, "", 0,"","","")
    fun getId(): Long = id
    fun getName(): String = name
    fun getCampeonatos(): Number = campeonatos
    fun getEntrenador():String = entrenador
    fun  getFundacion():String = fundacion
    fun getUrl():String = url
}