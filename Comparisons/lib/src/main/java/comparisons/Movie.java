package comparisons;

import java.util.Comparator;

public class Movie {

    private String title;
    private int year;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public static Comparator<Movie> sortByMostRecentYear() {
        return (a, b) -> b.getYear() - a.getYear();
    }

    public static Comparator<Movie> sortAlphabeticallyIgnoringArticles() {
        return (a, b) -> {
            String titleA = removeLeadingArticles(a.getTitle());
            String titleB = removeLeadingArticles(b.getTitle());
            return titleA.compareTo(titleB);
        };
    }

    private static String removeLeadingArticles(String title) {
        return title.replaceAll("^(A |An |The )", "");
    }
}
