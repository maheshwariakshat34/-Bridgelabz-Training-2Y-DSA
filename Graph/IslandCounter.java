import java.util.*;

public class IslandCounter {
    // Task 2: DFS Approach
    public int countIslandsDFS(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int count = 0;
        int[][] tempGrid = copyGrid(grid);
        
        for (int r = 0; r < tempGrid.length; r++) {
            for (int c = 0; c < tempGrid[0].length; c++) {
                if (tempGrid[r][c] == 1) {
                    count++;
                    dfs(tempGrid, r, c);
                }
            }
        }
        return count;
    }

    private void dfs(int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0) return;
        grid[r][c] = 0; // Mark as visited
        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }

    // Task 3: BFS Approach
    public int countIslandsBFS(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] tempGrid = copyGrid(grid);

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (tempGrid[r][c] == 1) {
                    count++;
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{r, c});
                    tempGrid[r][c] = 0;
                    
                    while (!q.isEmpty()) {
                        int[] curr = q.poll();
                        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
                        for (int[] d : dirs) {
                            int nr = curr[0] + d[0], nc = curr[1] + d[1];
                            if (nr >= 0 && nc >= 0 && nr < rows && nc < cols && tempGrid[nr][nc] == 1) {
                                tempGrid[nr][nc] = 0;
                                q.add(new int[]{nr, nc});
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    private int[][] copyGrid(int[][] grid) {
        return Arrays.stream(grid).map(int[]::clone).toArray(int[][]::new);
    }
}