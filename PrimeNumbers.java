public class PrimeNumbers {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 10
        for (int num = 2; num <= 10; num++) {
            boolean isPrime = true;

            // Check if num is prime
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If isPrime is still true, then it's a prime number
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}

