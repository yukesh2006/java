package day12;

public class CyclicGraph {
    static boolean hasCycle(int[][] graph, int node, int parent, boolean[] visited) {
        visited[node] = true;
        for (int neighbour : graph[node]) {
            if (!visited[neighbour]) {
                if (hasCycle(graph, neighbour, node, visited))
                    return true;
            } else if (neighbour != parent) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    	int[][] graph = {
    	    {1},
    	    {0, 2},
    	    {1, 3},
    	    {2}
    	};
    	boolean[] visited = new boolean[4];
        if (hasCycle(graph, 0, -1, visited))
            System.out.println("Cycle existed");
        else
            System.out.println("No Cycle existed");
    }
}
//For triangle put new boolen to [3]

