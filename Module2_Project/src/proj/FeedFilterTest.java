package proj;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FeedFilterTest {

    private FeedFilter feedFilter;
    private List<Post> posts;

    @Before
    public void setUp() {
        feedFilter = new FeedFilter();
        posts = Arrays.asList(
        	    new Post("Alice", "Loved this post!", LocalDateTime.of(2024, 9, 1, 10, 0), 10),
        	    new Post("Bob", "Amazing content!", LocalDateTime.of(2024, 9, 2, 11, 0), 50),
        	    new Post("Alice", "Check this out", LocalDateTime.of(2024, 9, 3, 12, 0), 5),
        	    new Post("Charlie", "Great article on content", LocalDateTime.of(2024, 9, 4, 13, 0), 30)
        	);
    }

    @Test
    public void testFilterByLikes() {
        List<Post> result = feedFilter.filterByLikes(posts, 10);
        assertEquals(3, result.size());
    }

    @Test
    public void testFilterByAuthor() {
        List<Post> result = feedFilter.filterByAuthor(posts, "Alice");
        assertEquals(2, result.size());
    }

    @Test
    public void testFilterByDateRange() {
        LocalDateTime start = LocalDateTime.of(2024, 9, 2, 0, 0);
        LocalDateTime end = LocalDateTime.of(2024, 9, 4, 23, 59); // Adjusted end time
        List<Post> result = feedFilter.filterByDateRange(posts, start, end);
        assertEquals(3, result.size()); // Should match the number of posts within the range
    }
    

    @Test
    public void testFilterByKeyword() {
        List<Post> result = feedFilter.filterByKeyword(posts, "content");
        assertEquals(2, result.size());
    }
}
