package unq.deportes.model

import java.io.Serializable
import javax.persistence.*


@Entity
@Table(name = "CompetitionPosition")
class CompetitionDetailItem(
        @Id
        @ManyToOne
        @JoinColumn(name = "CompetitionId")
        private val competitionId: Competition,
        @Column(name = "Position")
        private val position: Int,
        @Column(name = "Points")
        private val points: Int,
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
    fun getPoints(): Int = points
}