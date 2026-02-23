package lab8.the.java.collections.framework.comparable.vs.comparator;

public class Movie implements Comparable<Movie> {

    private String name;
    private double rating;
    private int year;

    /**
     * Used to sort movies by year
     */
    @Override
    public int compareTo(Movie movie) {
        // TODO
        // Compare this.year with movie.year
        return this.year - movie.year;
    }

    /**
     * Constructor
     */
    public Movie(String name, double rating, int year) {
        // TODO
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    /**
     * Getter for rating
     */
    public double getRating() {
        // TODO
        return this.rating;
    }

    /**
     * Getter for name
     */
    public String getName() {
        // TODO
        return this.name;
    }

    /**
     * Getter for year
     */
    public int getYear() {
        // TODO
        return this.year;
    }
}