import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DFS {


    ArrayList<Integer>[] adj;
    boolean[] visited;

    public DFS(int n) {
        adj = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        visited = new boolean[n + 1];
    }


    public void dfsRec(int src, int parent) {
        visited[src] = true;
        System.out.println("visiting " + src + " parent " + parent);
        for (int child : adj[src]) {
            if (!visited[child]) {
                dfsRec(child, src);
            }
        }
    }

    public void dfsStack(int src) {
        Stack<Integer> stack = new Stack<>();
        stack.add(src);
        visited[src] = true;
        while (!stack.empty()) {
            int cur = stack.pop();
            System.out.println("visiting " + cur);
            for (int child : adj[cur]) {
                if (!visited[child]) {
                    visited[child] = true;
                    stack.add(child);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        DFS dfs = new DFS(n);
        for (int i = 0; i < m; i++) {
            int from = in.nextInt(), to = in.nextInt();
            dfs.adj[from].add(to);
            dfs.adj[to].add(from);
        }
        dfs.dfsStack(1);
        Arrays.fill(dfs.visited, false);
        System.out.println("\n -------------- \n");
        dfs.dfsRec(1, -1);
    }
}
