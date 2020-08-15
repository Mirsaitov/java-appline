public class Task10 {
    public static void main(String[] args) {
        int[][] nums  = {{1, 2, 3,4}, {5, 6, 7,8}, {9,10, 11, 12}
        };
        for(int i = 0; i< 1; i++)
        {
            for(int t = 0; t<= 3; t++) {

                System.out.println(nums[i][t] + "*3=" + nums[i][t] * 3);
            }
        }
    }
}
