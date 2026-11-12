import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SheepAndWolf {
    static List<String> list = new ArrayList<>();
    static boolean[][] visited;
    static int sheepCount;
    static int wolfCount;
    static int[] rowM = {0, 1, 0, -1};
    static int[] colM = {1, 0, -1, 0};

    static void dfs(int row, int col, char c) {
        if (visited[row][col]) return;

        if (c == 'o') {
            sheepCount++;
        } else if (c == 'v') {
            wolfCount++;
        }
        visited[row][col] = true;

        for (int i = 0; i < rowM.length; i++) {
            int mr = row + rowM[i];
            int mc = col + colM[i];

            if (mr < 0 || mc < 0 || mr >= list.size() || mc >= list.get(row).length()) {
                continue;
            }
            if (visited[mr][mc]) continue;
            char getC = list.get(mr).charAt(mc);
            if (getC == '#') continue;
            dfs(mr, mc, getC);
        }
    }

    public static void main(String[] args) {
        new Thread(null, () -> solve(), "dfs", 1L << 28).start();
    }

    private static void solve() {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        visited = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            String inputLine = sc.nextLine();
            list.add(inputLine);
        }

        int sheep = 0;
        int wolves = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                char c = list.get(i).charAt(j);
                if (c == '#' || visited[i][j]) {
                    continue;
                }
                wolfCount = 0;
                sheepCount = 0;
                dfs(i, j, c);

                if (wolfCount >= sheepCount) {
                    wolves += wolfCount;
                } else {
                    sheep += sheepCount;
                }
            }
        }

        System.out.println(sheep + " " + wolves);
    }
}
