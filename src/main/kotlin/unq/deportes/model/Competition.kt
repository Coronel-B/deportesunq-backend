package unq.deportes.model

import javax.persistence.*

@Entity
@Table(name = "Competition")
class Competition(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        private val id: Long,
        private val name: String,
        private val year: Int,
        private val champion: String)
{
        private constructor() : this(0, "", 0, "")
        fun getId(): Long = id
        fun getName(): String = name
        fun getYear(): Int = year
        fun getChampion(): String = champion

}