package unq.deportes.model

class CompetitionDetails(
    private val id: Long,
    private val competition_detail_items: List<CompetitionPositions>)
{
    fun getId(): Long = id
    fun getCompetitionDetailItems(): List<CompetitionPositions> = competition_detail_items
}

class CompetitionPositions(
        private val position: Int,
        private val team: Team)
{
    constructor(comp : CompetitionDetailItem): this(comp.getPosition(), comp.getTeam())
    fun getPosition(): Int = position
    fun getTeam(): Team = team
}