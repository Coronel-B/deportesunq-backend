package unq.deportes.model

import javax.persistence.*

@Entity
@Table(name = "Team")
class Team(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "ID")
        private val id: Long,
        @Column(name = "FullName")
        private val fullName: String,
        @Column(name = "Alias")
        private val alias: String)
{
    private constructor() : this(0, "", "")
    fun getId(): Long = id
    fun getFullName(): String = fullName
    fun getAlias(): String = alias

}