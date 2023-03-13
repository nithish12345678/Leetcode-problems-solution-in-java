class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int  slots=0;

        for(int i=0;i<flowerbed.length;i++){

          if(flowerbed[i]==0){
                     if(i==0||flowerbed[i-1]==0 ){
                         if(i==flowerbed.length-1 ||flowerbed[i+1]==0 ){
                             slots++;
                             flowerbed[i]=1;
                         }
                     }
          }
        }
        if(slots>=n) return true;

        return false;
        
    }
}
