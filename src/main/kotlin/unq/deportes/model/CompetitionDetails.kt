package unq.deportes.model

class CompetitionDetails(
    private val id: Long,
    private val competition_detail_items: List<CompetitionDetailItem>)
{
    fun getId(): Long = id
    fun getCompetitionDetailItems(): List<CompetitionDetailItem> = competition_detail_items
}