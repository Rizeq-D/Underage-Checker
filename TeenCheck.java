import java.util.ArrayList;

public class TeenCheck {
    public static boolean hasTeen(ArrayList<Integer> ages) {
        for (int age : ages) {
            if (isTeen(age)) {

                return true;
            }
        }

        return false;
    }
    public static boolean isTeen(int age) {
        return (age >= 13 && age <= 19);
    }
}
