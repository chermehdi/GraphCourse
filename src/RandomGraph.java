import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class RandomGraph {
    static Random random = new Random();
    static final int BOUND = 4;

    public static int nextInt() {
        return nextInt(0, BOUND);
    }

    public static int nextInt(int from, int to) {
        return random.nextInt((to - from) + 1) + from;
    }

    public static void main(String[] args) throws FileNotFoundException {
        int n = nextInt();
        int m = nextInt(1, n * (n - 1) / 2);
        PrintWriter out = new PrintWriter(new FileOutputStream("graph.txt"));
        out.println(n + " " + m);

        for (int i = 0; i < m; i++) {
            int from = nextInt(0, n);
            int to = nextInt(0, n);
            while (from == to) {
                from = nextInt(0, n);
                to = nextInt(0, n);
            }
            out.println(from + " " + to);
        }

    }
}
