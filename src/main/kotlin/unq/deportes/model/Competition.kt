package unq.deportes.model

import javax.persistence.*

@Entity
@Table(name = "Competition")
class Competition(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "ID")
        private val id: Long,
        @Column(name = "Name")
        private val name: String,
        @Column(name = "Year")
        private val year: Int,
        @Column(name = "Champion")
        private val champion: String)
{
        private constructor() : this(0, "", 0, "")
        fun getId(): Long = id
        fun getName(): String = name
        fun getYear(): Int = year
        fun getChampion(): String = champion

}