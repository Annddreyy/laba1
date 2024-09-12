import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int size = in.nextInt();

        System.out.println("Введите элементы массива: ");
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = in.nextInt();
        }

        System.out.println("Введите степень мажоритарности: ");
        int power = in.nextInt();

        int k = (int)Math.ceil((double) size / power);

        if (Arrays.stream(numbers).max().getAsInt() <= size) System.out.println(Arrays.toString(majorityElementAlg1(numbers, k).toArray()));
        else System.out.println(Arrays.toString(majorityElementAlg2(numbers, k).toArray()));

    }

    protected static List<Integer> majorityElementAlg1(int[] arr, int k) {
        List<Integer> answer = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++){
            int index = arr[i] % n;
            arr[index] += n;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] / n >= k) answer.add(i);
        }

        return answer;
    }

    protected static List<Integer> majorityElementAlg2(int[] arr, int k) {
        List<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> numbersCount = new HashMap<>();

        for (int number: arr) {
            if (numbersCount.containsKey(number)) numbersCount.put(number, numbersCount.get(number) + 1);
            else numbersCount.put(number, 1);
        }

        for (int number: numbersCount.keySet()) {
            if (numbersCount.get(number) >= k) answer.add(number);
        }

        return answer;
    }
}

