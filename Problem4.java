import java.util.*;

class MultiplesCounter {
    private int[] numbers;
    public MultiplesCounter(int[] numbers) {
        this.numbers = numbers;
    }
    public Map<Integer, Integer> countMultiples() {
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }

        return result;
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter numbers:");
        String inputLine = sc.nextLine();

        String[] parts = inputLine.replace(",", " ").split("\\s+");

        int[] input = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            input[i] = Integer.parseInt(parts[i]);
        }
     
        MultiplesCounter counter = new MultiplesCounter(input);
        Map<Integer, Integer> output = counter.countMultiples();
      
        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + output.get(i));
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        sc.close();
    }
}
