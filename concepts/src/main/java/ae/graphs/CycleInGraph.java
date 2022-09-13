package ae.graphs;


/**
 * Find the cycle in unweighted and directed graph with atleast one node.
 */

public class CycleInGraph {


    public boolean cycleInGraph(int[][] edges) {
        // list of visited vertices
        boolean [] visited = new boolean[edges.length];
        boolean [] path = new boolean[edges.length];
        boolean res = false;
        for(int v=0;v<edges.length;v++){
            if(!visited[v] && !res){
                res = DFS(visited,path,edges,v);
            }
        }

        return res;


    }

    public static boolean DFS(boolean[] visited,boolean[] path,int[][] edges,int vertex){

        visited[vertex] = true;
        path[vertex]=true;
        for(int neighbour:edges[vertex]){
            if(!visited[neighbour]){

                if(DFS(visited,path,edges,neighbour)){
                    return true;
                }
            }else if(path[neighbour]){
                return true;
            }
        }
        path[vertex]=false;
        return false;
    }

}
