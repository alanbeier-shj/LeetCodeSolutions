public class test1 {
    public static void main(String[] args) {
        test_arr();
    }

    public static void test_arr() {
        int[][] arr = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}, {9, 9, 9}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  // 新的一行
            System.out.print(arr[i] + " ");
            System.out.println();  // 新的一行
        }
    }
}
