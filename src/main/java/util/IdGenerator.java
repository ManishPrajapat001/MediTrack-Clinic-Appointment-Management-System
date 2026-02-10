package util;

public class IdGenerator {
    private static int currentPersonId = 0;

    public static int getCurrentPersonId() {
        currentPersonId++;
        return currentPersonId;
    }


}
