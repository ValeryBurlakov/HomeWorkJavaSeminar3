import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class program {
    public static void main(String[] args) {
        System.out.println("Удаляем нечётные числа из:");
        List<Integer> integers = new ArrayList<>(Arrays.asList(-7, -6, -1, -3, 2, 3, 1, -1, -2, 3, 1, 7, -109, 6, 3, 5, 6, 11, 9, 8, 9, -9, -8, -10, 9, 9));
        System.out.println(integers);
        oddNumbers(integers);
        System.out.println("Результат:");
        System.out.println(integers); // 1 2 3 6 5 11 9

        System.out.println();

        System.out.println("Удаляем строки, которые являются числами из:");
        ArrayList<String> list = new ArrayList<>(List.of("3e19d", "3.14F", "string", "-7j", "444.444d", "5.0439", "1.1E+50", "-12", "my_value", "23.04j"));
        System.out.println(list);
        delNumbers(list);
        System.out.println("Результат:");
        System.out.println(list);
        }

    public static void oddNumbers(List<Integer> source) {
        int i = 0;
        while (i < source.size()) {
            Integer element = source.get(i);

            if (Math.abs(element) % 2 == 1) {
                source.remove(i);
            }
            else {
                i++;
            }
        }
    }

    public static boolean isIntegerNumber(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDoubleNumber(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void delNumbers(ArrayList<String> elem) {
        int i = 0;
        while (i < elem.size()) {
            String element = elem.get(i);
            if (isIntegerNumber(element) == true | isDoubleNumber(element) == true) {
                elem.remove(i);
            }
            else {
                i++;
            }
        }
    }
}

