package manager;

import org.junit.jupiter.api.Test;
import domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {


    @Test
    public void shouldGetTwoMovies() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "Bladshot", "thriller", "red");
        Movie second = new Movie(2, "Forward", "cartoon", "blue");
        manager.save(first);
        manager.save(second);

        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastTenFilmsOutOfTen() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "Bladshot", "thriller", "red");
        Movie second = new Movie(2, "Forward", "cartoon", "blue");
        Movie third = new Movie(3, "Hotel Belgrad", "melodrama", "blue");
        Movie fourth = new Movie(4, "Gentlemen", "adventure", "yellow");
        Movie fifth = new Movie(5, "Fifth", "cartoon", "yellow");
        Movie sixth = new Movie(6, "Sixth", "thriller", "red");
        Movie seventh = new Movie(7, "Seventh", "cartoon", "blue");
        Movie eighth = new Movie(8, "Eighth", "adventure", "yellow");
        Movie ninth = new Movie(9, "Ninth", "cartoon", "blue");
        Movie tenth = new Movie(10, "Tenth", "camedy", "green");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void ShouldFindLastTenFilmsOutOfTen1() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "Bladshot", "thriller", "red");
        Movie second = new Movie(2, "Forward", "cartoon", "blue");
        Movie third = new Movie(3, "Third", "cartoon", "blue");
        Movie fourth = new Movie(4, "Fourth", "adventure", "green");
        Movie fifth = new Movie(5, "Fifth", "cartoon", "yellow");
        Movie sixth = new Movie(6, "Sixth", "thriller", "red");
        Movie seventh = new Movie(7, "Seventh", "cartoon", "blue");
        Movie eighth = new Movie(8, "Eighth", "adventure", "yellow");
        Movie ninth = new Movie(9, "Ninth", "cartoon", "blue");
        Movie tenth = new Movie(10, "Tenth", "camedy", "green");
        Movie eleventh = new Movie(11, "Eleventh", "camedy", "black");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);
        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldSaveMovie() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "Bladshot", "thriller", "red");
        manager.save(first);
        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{first};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void ShouldFindLast1TenFilmsIfThePosterIsEmpty() {
        MovieManager manager = new MovieManager();
        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[0];

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastFiveFilmsIfThePosterIsEmpty() {
        MovieManager manager = new MovieManager(5);
        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[0];

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastFiveFilmsOutOfEleven() {
        MovieManager manager = new MovieManager(5);
        Movie first = new Movie(1, "Bladshot", "thriller", "red");
        Movie second = new Movie(2, "Forward", "cartoon", "blue");
        Movie third = new Movie(3, "Third", "cartoon", "blue");
        Movie fourth = new Movie(4, "Fourth", "adventure", "green");
        Movie fifth = new Movie(5, "Fifth", "cartoon", "yellow");
        Movie sixth = new Movie(6, "Sixth", "thriller", "red");
        Movie seventh = new Movie(7, "Seventh", "cartoon", "blue");
        Movie eighth = new Movie(8, "Eighth", "adventure", "yellow");
        Movie ninth = new Movie(9, "Ninth", "cartoon", "blue");
        Movie tenth = new Movie(10, "Tenth", "camedy", "green");
        Movie eleventh = new Movie(11, "Eleventh", "camedy", "black");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);
        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetThreeMoviesInsteadOfFive() {
        MovieManager manager = new MovieManager(5);
        Movie first = new Movie(1, "Bladshot", "thriller", "red");
        Movie second = new Movie(2, "Forward", "cartoon", "blue");
        Movie third = new Movie(3, "Hotel Belgrad", "camedy", "colored");
        manager.save(first);
        manager.save(second);
        manager.save(third);

        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastFiveFilmsOutOfFive1() {
        MovieManager manager = new MovieManager(5);
        Movie first = new Movie(1, "Bladshot", "thriller", "red");
        Movie second = new Movie(2, "Forward", "cartoon", "blue");
        Movie third = new Movie(3, "Third", "cartoon", "blue");
        Movie fourth = new Movie(4, "Fourth", "adventure", "green");
        Movie fifth = new Movie(5, "Fifth", "cartoon", "yellow");
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);

        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastFourFilmsOutOfFive() {
        MovieManager manager = new MovieManager(5);
        Movie first = new Movie(1, "Bladshot", "thriller", "red");
        Movie second = new Movie(2, "Forward", "cartoon", "blue");
        Movie third = new Movie(3, "Third", "cartoon", "blue");
        Movie fourth = new Movie(4, "Fourth", "adventure", "green");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);


        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }


}