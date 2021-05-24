class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        /*
            Psuedocode:
                - The set of vertices from which other nodes in the graph are reachable are vertices with 
                  only outgoing edges (outdegree > 0), no incoming edges (indegree = 0)
                  
                - Time Complexity: O(E + V)
        */
        
        
        // Set of vertices all nodes are reachable from
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Store all vertices in this ArrayList
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        
        // remove edges if it's being pointed to by another vertex 
        for (List<Integer> edge: edges) {
            // note that the remove method is actually O(N) instead of O(1)
            list.remove(edge.get(1));
        }
        
        // return set of vertices (with 0 indegree)
        return list; 
        
    }

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {

        boolean[] reachable = new boolean[n];
        List<Integer> list = new LinkedList<>();
        
        for(List<Integer> edge : edges){
            reachable[edge.get(1)] = true;
        }
        
        for(int i=0; i<n; i++){
            if(!reachable[i]){
                list.add(i);
            }
        }
        
        return list;

    }
}