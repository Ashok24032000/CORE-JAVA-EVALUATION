import java.util.Scanner;

class HourglassSum {
    static int hourglassSum(int[][] arr) {
        // int maxSum = Integer.MIN_VALUE;
        int maxSum = -10;
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 6; j++) {
                int currentSum = calculateHourglassSum(arr, i, j);
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    static int calculateHourglassSum(int[][] arr, int row, int col) {
        int sum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + arr[row + 1][col + 1] + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = new int[9][9];
        System.out.println("Enter the integer value seperated by spaces :");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        int result = hourglassSum(arr);
        System.out.println("Maximum Hourglass Sum: " + result);
    }
}



