import java.util.Scanner;
class LeftRotateByOne {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }   
        for (int i = n - 1; i > 0; i--) {
            int tmp = a[i];
            a[i] = a[i - 1];
            a[i - 1] = tmp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+ " ");
        }
    }
}
