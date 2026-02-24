package lab8.the.java.collections.framework.comparable.vs.comparator.comparator;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right){
        return Double.compare(left.getRating(), right.getRating());
    }

}
