// Вычислить n! (произведение чисел от 1 до n)

class SecTask {
    public static void main(String[] args) {
        int res = 1;
        int n = 6;
        for(int i = 2; i < n; i++) {
        res *= i;
        }
        System.out.println(res);
    }
}