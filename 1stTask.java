// // Вычислить n-ое треугольного число (сумма чисел от 1 до n)

class Main {
    public static void main(String[] args) {
        int res = 0;
        int n = 5;
        for(int i = 1; i < n; i++) {
            res += i;
        }
        System.out.println(res);
    }
}
