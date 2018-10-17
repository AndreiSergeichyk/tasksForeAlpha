import java.util.Arrays;

public class BSearchDemo {

    public static void main(String[] args) {
        Integer[] array = {23, 5, 6, 23, 1, 88, 13, 7, 12, 100};

        Arrays.sort(array, new DescendingSortComparator());
        System.out.println(Arrays.toString(array));

        int result = bsearch(array, 15);
        System.out.println(result < 0 ? "No such number" : String.valueOf(result));
    }

    private static int bsearch(Integer[] array, int value) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < value) {
                result = i;
                break;
            }
        }

        return result;
    }
}
