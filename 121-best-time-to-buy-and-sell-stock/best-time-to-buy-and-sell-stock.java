class Solution {
    public int maxProfit(int[] a) {
        int buy=a[0];
        int maxp=0;
        for(int i=0;i<a.length;i++){
            if(buy<a[i]){
               int p=a[i]-buy;
                maxp=Math.max(maxp,p);
            }
            else{
                buy=a[i];
            }
        }
        return maxp;
    }
}