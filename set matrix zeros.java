import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[n][m];

        System.out.println("Input matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        setZeros(arr, n, m);

        System.out.println("Modified matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }

    public static void setZeros(int[][] arr, int n, int m) {
        boolean firstRowZero = false;
        boolean firstColZero = false;

        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        for (int j = 0; j < m; j++) {
            if (arr[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        if (firstRowZero) {
            for (int j = 0; j < m; j++) {
                arr[0][j] = 0;
            }
        }

        if (firstColZero) {
            for (int i = 0; i < n; i++) {
                arr[i][0] = 0;
            }
        }
    }
}
