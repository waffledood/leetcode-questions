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

        // visited array to track if the vertex has been visited
        int[] visited = new int[n];
        // 

        

    }

    public void recursiveDFS() {
        //
    }
}