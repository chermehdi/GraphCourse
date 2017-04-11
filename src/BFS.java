import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {


    ArrayList<Integer>[] adj;
    boolean[] visited;

    public BFS(int n) {
        adj = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        visited = new boolean[n + 1];
    }

    public void bfs(int src) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(src);
        visited[src] = true;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            System.out.println("visiting " + cur);
            for (int child : adj[cur]) {
                if (!visited[child]) {
                    visited[child] = true;
                    queue.add(child);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        BFS bfs = new BFS(n);

        for (int i = 0; i < m; i++) {
            int from = in.nextInt(), to = in.nextInt();
            bfs.adj[from].add(to);
            bfs.adj[to].add(from);
        }

        bfs.bfs(1);
    }
}
