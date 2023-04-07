import java.util.ArrayList;

/*
    1부터 30까지의 숫자 중 소수 찾기
 */
public class Main2 {
    public static void main(String[] args) {
        boolean isPrime;

        for (int i = 2; i <= 30; i++) {
            isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
