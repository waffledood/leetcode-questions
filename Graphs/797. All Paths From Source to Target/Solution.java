import java.util.*;
import java.io.*; 

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        /*
        Approach:
            Perform recursive DFS & stop when the target node is reached.
        
        Pseudocode:
            Loop through graph array & find the target vertex  

            // Use the Adjacency List to perform recursive DFS.
            loop through Adjacency List
                loop through neighbors of current vertex in Adjacency List
                    create a new ArrayList arr

                    DFS(int[][] graph, int[] visited, ArrayList arr): 
                        If (reached the target vertex)
                            return
                        else 
                            add current node to arr 

                    add arr to list of ArrayList
        */

        // answer / store the list of possible paths from source to target vertex
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        // target node
        int target = graph.length - 1;
        
        // recursive DFS
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        recursiveDFS(graph, arr, 0, target, ans);

        return ans;        

    }

    public void recursiveDFS(int[][] graph, ArrayList<Integer> arr, int curr, int target, List<List<Integer>> ans) {

        for (int i = 0; i < graph[curr].length; i++) {
            ArrayList<Integer> arr2 = new ArrayList<Integer>(arr);
            
            int vertex = graph[curr][i];
            
            if (vertex == target) {
                arr2.add(vertex);
                ans.add(arr2);
                //return;
            } else {
                arr2.add(vertex);
                recursiveDFS(graph, arr2, vertex, target, ans);
            }
        }
        
    }
}