class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int i = 0;
        for(;i<intervals.length;i++){
            if(intervals[i][0]>newInterval[0])
                break;
            else
                list.add(intervals[i]);
        }
        
        if(list.isEmpty())
            list.add(newInterval);
         else{
             int[] prevList = list.get(list.size()-1);
             if(prevList[1]>=newInterval[0])
                 prevList[1] =Math.max(prevList[1],newInterval[1]);
             else
                 list.add(newInterval);
         }
        
        for(;i<intervals.length;i++){
            int[] prevList = list.get(list.size()-1);
            if(prevList[1]>=intervals[i][0])
                 prevList[1] =Math.max(prevList[1],intervals[i][1]);
            else
                list.add(intervals[i]);
        }
        
        return list.toArray(new int[list.size()][]);
    }
}