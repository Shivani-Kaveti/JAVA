package proj;

import java.time.LocalDateTime;

public class Post {
    private String author;
    private String content;
    private LocalDateTime timestamp;
    private int likes;

    public Post(String author, String content, LocalDateTime timestamp, int likes) {
        this.author = author;
        this.content = content;
        this.timestamp = timestamp;
        this.likes = likes;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return "Post{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                ", likes=" + likes +
                '}';
    }
}
