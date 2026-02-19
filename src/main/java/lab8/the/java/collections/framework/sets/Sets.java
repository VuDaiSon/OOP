package lab8.the.java.collections.framework.sets;

import java.util.*;

public class Sets {

    /**
     * Function returning the intersection of two given sets
     * (without using library functions)
     */
    public static Set<Integer> intersectionManual(Set<Integer> first,
                                                  Set<Integer> second) {
        // TODO
        Set<Integer> result = new HashSet<>();
        for(int i : first){
             if(second.contains(i)){
                 result.add(i);
             }
        }
        return result;
    }

    /**
     * Function returning the union of two given sets
     * (without using library functions)
     */
    public static Set<Integer> unionManual(Set<Integer> first,
                                           Set<Integer> second) {
        // TODO
        Set<Integer> result = new HashSet<>();
        for (int i:first){
                result.add(i);
            }

        for (int i : second){
            result.add(i);
        }
        return result;
    }

    /**
     * Function returning the intersection of two given sets (see retainAll())
     */
    public static Set<Integer> intersection(Set<Integer> first,
                                            Set<Integer> second) {
        // TODO
        Set<Integer> result = new HashSet<>(first);
        result.retainAll(second);
        return result;
    }

    /**
     * Function returning the union of two given sets (see addAll())
     */
    public static Set<Integer> union(Set<Integer> first,
                                     Set<Integer> second) {
        // TODO
        Set<Integer> result = new HashSet<>(first);
        result.addAll(second);
        return result;
    }

    /**
     * Function to transform a set into a list without duplicates
     * Note well: collections can be created from another collection!
     */
    public static List<Integer> toList(Set<Integer> source) {
        // TODO
        List<Integer> result = new ArrayList<>(source);
        return result;
    }

    /**
     * Function to remove duplicates from a list
     * Note well: collections can be created from another collection!
     */
    public static List<Integer> removeDuplicates(List<Integer> source) {
        // TODO
        Set<Integer> listToSet = new HashSet<>(source);
        List<Integer> result = new ArrayList<>(listToSet);
        return result;
    }

    /**
     * Function to remove duplicates from a list
     * without using the constructor trick seen above
     */
    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        // TODO
        List<Integer> result = new ArrayList<>();
        for(int i : source){
            if(!result.contains(i)){
                result.add(i);
            }
        }
        return result;
    }

    /**
     * Function accepting a string
     * returning the first recurring character
     * Example: firstRecurringCharacter("abaco") -> "a"
     */
    public static String firstRecurringCharacter(String s) {
        // TODO
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
           if(seen.contains(c)){
               return String.valueOf(c);
           }
           else {
               seen.add(c);
           }
        }
        return null;
    }

    /**
     * Function accepting a string,
     * and returning a set comprising all recurring characters.
     * Example: allRecurringChars("mamma") -> [m, a]
     */
    public static Set<Character> allRecurringChars(String s) {
        // TODO
        Set<Character> seen = new HashSet<>();
        Set<Character> result = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(seen.contains(c)) {
                result.add(c);
            }else {
                seen.add(c);
            }
        }
        return result;
    }

    /**
     * Function to transform a set into an array
     */
    public static Integer[] toArray(Set<Integer> source) {
        // TODO
        Integer[] result = source.toArray(new Integer[0]);
        return result;
    }

    /**
     * Function to return the first item from a TreeSet
     * Note well: use TreeSet specific methods
     */
    public static int getFirst(TreeSet<Integer> source) {
        // TODO
        return source.first();
    }

    /**
     * Function to return the last item from a TreeSet
     * Note well: use TreeSet specific methods
     */
    public static int getLast(TreeSet<Integer> source) {
        // TODO
        return source.last();
    }

    /**
     * Function to get an element from a TreeSet
     * which is strictly greater than a given element.
     * Note well: use TreeSet specific methods
     */
    public static int getGreater(TreeSet<Integer> source, int value) {
        // TODO
        return source.higher(value);
    }
}
