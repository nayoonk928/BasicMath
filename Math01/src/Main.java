/*
    1부터 30까지의 숫자 중 5로 나눈 몫과 나머지가 모두 소수인 숫자들을 찾아보자.
    1. 몫으로 나올 수 있는 소수 찾는다.
    2. (5 * 몫)에 5 보다 작은 소수를 더한다.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 5보다 작은 소수 구하기
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i < 5; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }

        for (int i = 1; i <= 30; i++) {
            int quotient = i / 5;
            int remainder = i % 5;
            if (isPrime(quotient) && isPrime(remainder)) {
                answer.add(i);
            }
        }

        System.out.println(answer);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}