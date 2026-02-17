package lab8.the.java.collections.framework.exercise.on.lists;

import java.util.*;

public class Lists {

    /**
     * Function to insert an element into a list at the beginning
     */
    public static void insertFirst(List<Integer> list, int value) {
        // TODO
        list.add(0, value);
    }

    /**
     * Function to insert an element into a list at the end
     */
    public static void insertLast(List<Integer> list, int value) {
        // TODO
        list.add(value);
    }

    /**
     * Function to replace the 3rd element of a list with a given value
     */
    public static void replace(List<Integer> list, int value) {
        // TODO
        list.set(2,value);

    }

    /**
     * Function to remove the 3rd element from a list
     */
    public static void removeThird(List<Integer> list) {
        // TODO
        list.remove(2);
    }

    /**
     * Function to remove the element "666" from a list
     */
    public static void removeEvil(List<Integer> list) {
        // TODO
        list.remove(Integer.valueOf(666));
    }

    /**
     * Function returning a List<Integer> containing
     * the first 10 square numbers (i.e., 1, 4, 9, 16, ...)
     */
    public static List<Integer> generateSquare() {
        // TODO
        List<Integer> list= new ArrayList<>();
        for(int i = 1; i<=10; i++){
            list.add(i*i);
        }
        return list;

    }

    /**
     * Function to verify if a list contains a certain value
     */
    public static boolean contains(List<Integer> list, int value) {
        // TODO
        return list.contains(value);
    }

    /**
     * Function to copy a list into another list (without using library functions)
     * Note well: the target list must be emptied before the copy
     */
    public static void copy(List<Integer> source, List<Integer> target) {
        // TODO
        target.clear();

        for (int i=0; i<source.size(); i++){
            target.add(source.get(i));
        }
    }

    /**
     * Function to reverse the elements of a list
     */
    public static void reverse(List<Integer> list) {
        // TODO
        Collections.reverse(list);
    }

    /**
     * Function to reverse the elements of a list (without using library functions)
     */
    public static void reverseManual(List<Integer> list) {
        // TODO
        int left = 0;
        int right = list.size()-1;
        while (left<right){
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left ++;
            right--;
        }
    }

    /**
     * Function to insert the same element both at the
     * beginning and the end of the same LinkedList
     * Note well: you can use LinkedList specific methods
     */
    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        // TODO
        list.addFirst(value);
        list.addLast(value);
    }
}
