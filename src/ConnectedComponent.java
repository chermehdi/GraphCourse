import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConnectedComponent {

    ArrayList<Integer>[] adj;
    int[] visited;

    public ConnectedComponent(int n) {
        adj = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++)
            adj[i] = new ArrayList<>();
        visited = new int[n + 1];
        Arrays.fill(visited, -1);
    }

    public void dfs(int src, int color) {
        visited[src] = color;
        for (int child : adj[src]) {
            if (visited[child] == -1) {
                dfs(child, color);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        ConnectedComponent cc = new ConnectedComponent(n);
        int ccCount = 0;
        for (int i = 0; i < m; i++) {
            int from = in.nextInt(), to = in.nextInt();
            cc.adj[from].add(to);
            cc.adj[to].add(from);
        }

        for (int i = 1; i < n + 1; i++) {
            if (cc.visited[i] == -1) {
                cc.dfs(i, ccCount);
                System.err.println(Arrays.toString(cc.visited));
                ++ccCount;
            }
        }

        System.out.println("the connected component count is " + ccCount);
        StringBuilder[] ccS = new StringBuilder[n + 1];
        for (int i = 0; i <= n; i++) ccS[i] = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            ccS[cc.visited[i]].append(i + " ");
        }
        System.out.println("the connected components are ");

        for (int i = 0; i <= n; i++) {
            if (ccS[i].toString().isEmpty()) continue;
            System.out.println(ccS[i]);
        }
    }

}
