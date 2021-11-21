package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class movieManagerTest {
    movieManager service = new movieManager();




    @Test
    public void shouldGetPoster() {
        movieManager service = new movieManager();
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"};
        String[] expected = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"};
        String[] actual = service.getPoster(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovie() {
        movieManager service = new movieManager();
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"};
        String[] expected = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne", "ZERO"};
        String[] actual = service.addMovie("ZERO", poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAddedMoviesOneCheck() {
        movieManager service = new movieManager(5);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"};
        String[] expected = {"numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAddedMoviesTwoCheck() {
        movieManager service = new movieManager(10);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"};
        String[] expected = {"numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade", "forward", "bloodshot"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAddedMoviesThreeCheck() {
        movieManager service = new movieManager(11);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"};
        String[] expected = {"numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade", "forward", "bloodshot"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAddedMoviesFourCheck() {
        movieManager service = new movieManager(0);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"};
        String[] expected = {};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAddedMoviesFiveCheck() {
        movieManager service = new movieManager(11);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne", "Summer", "Summer", "Summer", "Summer", "Summer"};
        String[] expected = {"Summer", "Summer", "Summer", "Summer", "Summer", "numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAddedMovieSixCheck() {
        movieManager service = new movieManager(1);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"};
        String[] expected = {"numberOne"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

}