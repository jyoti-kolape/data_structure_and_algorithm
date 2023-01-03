package com.practice.ds.scaler.practice.day84;

import java.util.*;

public class PathDirectedGraph {

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 2}));
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(new Integer[]{4, 1}));
        ArrayList<Integer> arr3 = new ArrayList<Integer>(Arrays.asList(new Integer[]{2, 4}));
        ArrayList<Integer> arr4 = new ArrayList<Integer>(Arrays.asList(new Integer[]{3, 4}));
        ArrayList<Integer> arr5 = new ArrayList<Integer>(Arrays.asList(new Integer[]{5, 2}));
        ArrayList<Integer> arr6 = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 3}));
        ArrayList<ArrayList<Integer>> B = new ArrayList<>(Arrays.asList(arr1, arr2, arr3, arr4, arr5, arr6));
        System.out.println(solve(5, B));
    }
    public static int solve1(int A, ArrayList<ArrayList<Integer>> B) {

        return 0;
    }

    public static int solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> []adjlist = new ArrayList[A+1];
        for(int i =1 ;i<=A;++i) {
            adjlist[i] = new ArrayList<Integer>();
        }
        for(ArrayList<Integer> i : B){
            int a  = i.get(0);
            int b =  i.get(1);
            adjlist[a].add(b);
        }
        int []visited = new int[A+1];
        boolean flag = dfs(1,adjlist,visited,A);
        return (flag)?1:0;
    }
    public static boolean dfs(int curr,ArrayList<Integer> []adjlist,int []visited,int dst){
        if(curr==dst)return true;
        visited[curr] = 1;
        for(int i : adjlist[curr]){
            if(visited[i]==0){
                if(dfs(i,adjlist,visited,dst))return true;
            }
        }
        return false;
    }
}
