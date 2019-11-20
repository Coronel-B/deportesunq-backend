package unq.deportes.model

import javax.persistence.*

@Entity
@Table(name = "Team")
class Team(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        private val id: Long,
        private val fullName: String,
        private val alias: String,
        private val competition_id: Long,
        private val position: Int)
{
    private constructor() : this(0, "", "", 0, 0)
    fun getId(): Long = id
    fun getFullName(): String = fullName
    fun getAlias(): String = alias
    fun getCompetitionId(): Long = competition_id
    fun getPosition(): Int = position
}