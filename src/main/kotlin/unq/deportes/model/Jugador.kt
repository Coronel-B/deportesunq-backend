package unq.deportes.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "Jugador")
class Jugador(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "ID")
        private val id: Long = 0,
        @Column(name = "Name")
        private val name: String = "",
        @Column(name = "Surname")
        private val apellido: String  = "",
        @Column(name = "Goals")
        private val goles: Int = 0,
        @Column(name = "Shirt")
        private val dorsal: Int = 0,
        @ManyToOne
        @JoinColumn(name = "Team")
        private val equipo: Team = Team(0,"",0,"","","")): Serializable
{
    companion object {
        private const val serialVersionUID = 20191120L
    }
    fun getId(): Long = id
    fun getName(): String = name
    fun getApellido(): String = apellido
    fun getGoles(): Int = goles
    fun getDorsal(): Int = dorsal
    fun getEquipo(): Team = equipo
}