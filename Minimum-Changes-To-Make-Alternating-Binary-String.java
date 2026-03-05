1class Solution {
2    public int minOperations(String s) {
3        int count=0;
4        int num=s.length();
5        for(int i=0;i<num;i++){
6            count+=(s.charAt(i)^i)&1;
7        }
8        return Math.min(count,num-count);
9    }
10}