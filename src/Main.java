import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * this class will contain a test with our Graph API
 * <p>
 * Created by mac on 10/04/2017.
 */
public class Main {

    static ArrayList<Integer>[] adj;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        adj = new ArrayList[n + 1];

        int[][] mat = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int from = in.nextInt(), to = in.nextInt();
//            adj[from].add(to);
//            adj[to].add(from);
            mat[from][to] = mat[to][from] = 1;
        }
        for (int[] temp : mat) {
            System.out.println(Arrays.toString(temp));
        }
    }
}
