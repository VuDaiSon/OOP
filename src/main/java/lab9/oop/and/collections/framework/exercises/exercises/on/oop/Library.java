package lab9.oop.and.collections.framework.exercises.exercises.on.oop;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }
    public Rent getLongestRent() {
        if (rents == null || rents.length == 0) {
            throw new IllegalArgumentException("Rents cannot be null or empty");
        }
        Rent max = rents[0];
        for (int i = 1; i < rents.length; i++) {
            if ((max.getEnd().getTime() - max.getBegin().getTime()) < (rents[i].getEnd().getTime() - rents[i].getBegin().getTime())) {
                max = rents[i];
            }
        }
        return max;
    }
}
