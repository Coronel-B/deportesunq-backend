package unq.deportes.model

import java.io.Serializable
import javax.persistence.*


@Entity
@Table(name = "CompetitionPosition")
class CompetitionDetailItem(
        @Id
        @ManyToOne
        @JoinColumn(name = "Competitionid")
        private val competitionId: Competition,
        @Id
        @Column(name = "Position")
        private val position: Int,
        @Id
        @ManyToOne
        @JoinColumn(name = "Team")
        private val team: Team): Serializable
{
    companion object {
        private const val serialVersionUID = 20191120L
    }
    fun getCompetitionId(): Competition = competitionId
    fun getPosition(): Int = position
    fun getTeam() : Team = team
}