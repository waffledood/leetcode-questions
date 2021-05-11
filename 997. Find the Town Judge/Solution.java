import java.util.*;
import java.io.*;

class Solution {
    public int findJudge(int N, int[][] trust) {
        
        // Hash Map to store <person A, number of people trusted by A>
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        // Adjacency List (1-indexed) to store number of outgoing edges from a vertex
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(N+1);
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<Integer>()); 
        }
        
        if (N == 1) return 1;
        
        for (int i = 0; i < trust.length; i++) {
            
            int source = trust[i][0];
            int target = trust[i][1];
            
            // if mapping of person A is not in HashMap, create one
            if (hash.get(target) == null) {
                hash.put(target, 1);
            } else {
                hash.put(target, hash.get(target) + 1);
            }
            list.get(source).add(target);
        }
        
        // iterate through HashMap & find the person trusted by N-1 people (judge)
        for (int i = 1; i <= N; i++) {
            int num = hash.get(i) != null ? hash.get(i) : -2 ;
            if (num == N-1 && list.get(i).size() == 0) {
                return i;
            }
        }
        
        // if HashMap does not contain a value of n-1, return -1 
        return -1;
    }
}