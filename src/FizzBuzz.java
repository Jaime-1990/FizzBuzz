public class FizzBuzz {
    public static void main(String[] args) {
        // Números pares
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                for (int k = 1; k <= 100; k++) {
                    // FIZZBUZZ
                    if (k % 3 == 0 && k % 5 == 0) {
                        System.out.println("FizzBuzz");
                        //FIZZ
                    } else if (k % 3 == 0) {
                        System.out.println("Fizz");
                        //BUZZ
                    } else if (k % 5 == 0) {
                        System.out.println("Buzz");
                        
                    } else {
                        System.out.println(k);
                    }
                }
            }
        }
    }
}
