/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package comparisons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Shawshank Redemption", 1994));
        movies.add(new Movie("A Beautiful Mind", 2001));
        movies.add(new Movie("Avatar", 2009));
        movies.add(new Movie("Forrest Gump", 1994));
        movies.add(new Movie("The Godfather", 1972));
//Movie moviees=new Movie("title",2000);

        Collections.sort(movies, Movie.sortByMostRecentYear());

        System.out.println("Sorted by most recent year:");
        for (Movie movie : movies) {
            System.out.println(movie.getTitle() + " (" + movie.getYear() + ")");
        }

        Collections.sort(movies, Movie.sortAlphabeticallyIgnoringArticles());

        System.out.println("\nSorted alphabetically ignoring articles:");
        for (Movie movie : movies) {
            System.out.println(movie.getTitle() + " (" + movie.getYear() + ")");
        }
    }
}