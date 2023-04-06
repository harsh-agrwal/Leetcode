class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int dis[]=new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[src]=0;
        for(int i=0;i<=k;i++){
            int cost[]=Arrays.copyOf(dis,n);
            for(int x[]:flights){
                int u=x[0],v=x[1];
                int fare=x[2];
                if(dis[u]==Integer.MAX_VALUE)continue;
                if(dis[u]+fare<cost[v])
                    cost[v]=dis[u]+fare;   
            }
             dis=cost;
        }
        return dis[dst]==Integer.MAX_VALUE?-1:dis[dst];
    }
}
