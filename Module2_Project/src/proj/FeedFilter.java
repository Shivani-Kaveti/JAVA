package proj;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class FeedFilter {

    // Filter posts by a minimum number of likes
    public List<Post> filterByLikes(List<Post> posts, int minLikes) {
        return posts.stream()
                .filter(post -> post.getLikes() >= minLikes)
                .collect(Collectors.toList());
    }

    // Filter posts by author
    public List<Post> filterByAuthor(List<Post> posts, String author) {
        return posts.stream()
                .filter(post -> post.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    // Filter posts within a time range
    public List<Post> filterByDateRange(List<Post> posts, LocalDateTime start, LocalDateTime end) {
        return posts.stream()
                .filter(post -> !post.getTimestamp().isBefore(start) && !post.getTimestamp().isAfter(end))
                .collect(Collectors.toList());
    }


    // Filter posts containing specific keywords
    public List<Post> filterByKeyword(List<Post> posts, String keyword) {
        return posts.stream()
                .filter(post -> post.getContent().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }
}
