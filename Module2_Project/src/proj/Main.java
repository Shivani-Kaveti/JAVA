package proj;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FeedFilter filter = new FeedFilter();
        List<Post> posts = Arrays.asList(
                new Post("Alice", "Loved this post!", LocalDateTime.of(2024, 9, 1, 10, 0), 10),
                new Post("Bob", "Amazing content!", LocalDateTime.of(2024, 9, 2, 11, 0), 50),
                new Post("Alice", "Check this out", LocalDateTime.of(2024, 9, 3, 12, 0), 5),
                new Post("Charlie", "Great article", LocalDateTime.of(2024, 9, 4, 13, 0), 30)
        );

        System.out.println("Posts with at least 10 likes:");
        filter.filterByLikes(posts, 10).forEach(System.out::println);

        System.out.println("Posts by Alice:");
        filter.filterByAuthor(posts, "Alice").forEach(System.out::println);

        LocalDateTime start = LocalDateTime.of(2024, 9, 2, 0, 0);
        LocalDateTime end = LocalDateTime.of(2024, 9, 4, 0, 0);
        System.out.println("Posts between September 2 and September 4:");
        filter.filterByDateRange(posts, start, end).forEach(System.out::println);

        System.out.println("Posts containing 'content':");
        filter.filterByKeyword(posts, "content").forEach(System.out::println);
    }
}
