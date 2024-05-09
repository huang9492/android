object NewsDataSource {
val newsList: List<News> = listOf(
News(1, "News 1 Title", "News 1 Content", System.currentTimeMillis(), "Source 1"),
News(2, "News 2 Title", "News 3 Content", System.currentTimeMillis(), "Source 2"),
News(3, "News 3 Title", "News 3 Content", System.currentTimeMillis(), "Source 3")
)
}

object NovelDataSource {
val novelList: List<Novel> = listOf(
Novel(1, "Novel 1 Title", "Author 1", 10, 4.5f),
Novel(2, "Novel 2 Title", "Author 2", 15, 4.8f),
Novel(3, "Novel 3 Title", "Author 3", 20, 4.2f)
)
}