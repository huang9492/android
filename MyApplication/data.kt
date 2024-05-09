data class News(
        val id: Int,
        val title: String,
        val content: String,
        val timestamp: Long,
        val source: String
)

data class Novel(
        val id: Int,
        val title: String,
        val author: String,
        val chapters: Int,
        val rating: Float
)