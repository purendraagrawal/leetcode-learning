class Solution {
    public int[][] merge(int[][] intervals) {
     Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
     List<int[]> list = new ArrayList<>();
        for(int[] interval:intervals){
            if(list.isEmpty()){
                list.add(interval);
            }else{
                int[] prevList = list.get(list.size()-1);
                if(prevList[1]>=interval[0])
                    prevList[1] = Math.max(prevList[1], interval[1]);
                else
                    list.add(interval);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}