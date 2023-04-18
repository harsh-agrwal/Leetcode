class Solution {
     List<List<Integer>> list=new ArrayList<>();
     List<Integer> l=new ArrayList<>();
    public int[][] insert(int[][] intervals, int[] newInterval) {
        for(int i=0;i<intervals.length;i++)
        {
        int first=intervals[i][0];
        int second=intervals[i][1];
        if(newInterval[1]<first){
            return help(newInterval,intervals,i);
        }else if(intervals[i][1]<newInterval[0])
        {
            l.add(intervals[i][0]);
            l.add(intervals[i][1]);
            list.add(l);
            l=new ArrayList<>();
        }else{
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
        }
        }

        return help(newInterval,intervals,intervals.length);

        }
    public int[][] help(int newInterval[],int a[][],int index)
    {
         l=new ArrayList<>();
        l.add(newInterval[0]);
        l.add(newInterval[1]);
        list.add(l);
       for(int i=index;i<a.length;i++)
       {
           l=new ArrayList<>();
           l.add(a[i][0]);
           l.add(a[i][1]);
           list.add(l);
       }
       int res[][]=new int[list.size()][2];
       for(int j=0;j<res.length;j++)
       {
           res[j][0]=list.get(j).get(0);
           res[j][1]=list.get(j).get(1);
       }
       return res;

    }
}
