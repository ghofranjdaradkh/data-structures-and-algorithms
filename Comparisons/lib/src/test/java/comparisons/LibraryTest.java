/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package comparisons;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    public void testSortByMostRecentYear() {
        Movie movie1 = new Movie("Movie1", 2015);
        Movie movie2 = new Movie("Movie2", 2020);

        Comparator<Movie> mostRecentYearComparator = Movie.sortByMostRecentYear();

        int result = mostRecentYearComparator.compare(movie1, movie2);
        assertTrue(result >0);
    }

    @Test
    public void testSortAlphabeticallyIgnoringArticles() {
        Movie movie1 = new Movie("The Movie", 2020);
        Movie movie2 = new Movie("An Awesome Movie", 2023);

        Comparator<Movie> alphabeticallyIgnoringArticlesComparator = Movie.sortAlphabeticallyIgnoringArticles();

        int result = alphabeticallyIgnoringArticlesComparator.compare(movie1, movie2);
        assertTrue(result > 0);
    }

}