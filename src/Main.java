public class Main {
    public static void main(String[] args) {

        int target = 3;

        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        Solution solObj = new Solution();

        boolean foundTarget = solObj.searchMatrix(matrix, target);

        System.out.println("found target: " + foundTarget);
    }
}