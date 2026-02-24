package lab8.the.java.collections.framework.comparable.vs.comparator.comparator;

import java.util.Comparator;

class NameCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right){
        return left.getName().compareTo(right.getName());
    }
}
