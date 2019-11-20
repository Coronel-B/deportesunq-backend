package unq.deportes.model

class CompetitionDetailItem(
        private val position: Int,
        private val team: TeamDetails)
{
    fun getPosition(): Int = position
    fun getTeam() : TeamDetails = team
}

class TeamDetails(
        private val id:Long,
        private val alias: String,
        private val fullName: String
){
    fun getId(): Long = id
    fun getAlias(): String = alias
    fun getFullName(): String = fullName
}