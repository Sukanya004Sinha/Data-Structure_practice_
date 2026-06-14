package Assignment.basic;

/**
 * You are given an n x n connectivity matrix, links, where links[i][j] = 1 if there is a direct, two-way communication link between server i and server j.
 * Your goal is to write a function that returns the total number of isolated server clusters.
 * Example 1:
 * links = [[1,1,0],[1,1,0],[0,0,1]]
 * Output: 2
 */
public class ClusterServerCount {
    public static void main(String[] args) {
        int[][] links= {
                {1,1,1},
                {1,1,1},
                {1,1,1}};

        System.out.println(clusterSCount(links));


    }

    public static int clusterSCount(int[][] links) {
        int n = links.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(links,visited,i);
                count++;
            }
        }
      return count;
    }

    public static void dfs(int[][]links, boolean[] visited, int node){
        visited[node] = true;
        for (int j = 0; j < links.length; j++) {
            if(links[node][j]==1 && !visited[j]){
                dfs(links,visited,j);
            }
        }
    }
}
