public class NumberChange {
    public static void main(String[] args) {
  int number = 23;
        int result = findNextChange(number);
        System.out.println(result);
    }

    public static int findNextChange(int number) {
        char[] digits = String.valueOf(number).toCharArray();

// Находим индекс самой правой цифры, которую можно поменять
        int a = digits.length - 2;
        while (a >= 0 && digits[a] >= digits[a + 1]) {
            a--;
        }

        if (a < 0) {
// Перестановка невозможна
            return -1;
        }

// Находим индекс самой правой цифры, которую можно заменить
        int b = digits.length - 1;
        while (digits[b] <= digits[a]) {
            b--;
        }

// Меняем найденные цифры местами
        swap(digits, a, b);

// Переворачиваем правую часть числа
        reverse(digits, a + 1);

        int result = Integer.parseInt(new String(digits));
        return result;
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void reverse(char[] arr, int start) {
        int a = start;
        int b = arr.length - 1;
        while (a < b) {
            swap(arr, a, b);
            a++;
            b--;
        }
    }
}

