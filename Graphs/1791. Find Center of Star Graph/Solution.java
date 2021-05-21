class Solution {
    public int findCenter(int[][] edges) {
        /*
            Pseudocode:
                - Create a 1D array (acts as adjacency list, storing no. of neighbors it has)
                - Loop through edges 2D array & updated adjacency list accordingly
                - Loop through adjacency list & find the node connected to E neighbors
                - Time Complexity: O(N)
                - Space Complexity: O(N)
        */
        int E = edges.length;
        int[] arr = new int[E+1];
        
        for (int i = 0; i < E; i++) {
            arr[edges[i][0]-1]++;
            arr[edges[i][1]-1]++;
        }
        
        for (int i = 0; i <= E; i++) {
            int num = arr[i];
            if (num == E) {
                return i+1;
            }
        }
        
        return -1;
    }
}