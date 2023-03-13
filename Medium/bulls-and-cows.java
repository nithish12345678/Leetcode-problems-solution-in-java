class Solution {
    public String getHint(String secret, String guess) {
        int bulls=0;
        int cows=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<secret.length();i++){
            char c1=secret.charAt(i);
            char c2=guess.charAt(i);
            
            if(map.containsKey(c1)){
                map.put(c1,map.get(c1)+1);
            }
            else{
                 map.put(c1,1);
            }

            if(c1==c2){
                bulls++;
                map.put(c1,map.get(c1)-1);
            }
        }

        for(int i=0;i<guess.length();i++){
            char c1=secret.charAt(i);
            char c2=guess.charAt(i);
            if(c1!=c2  && map.containsKey(c2) && map.get(c2)>0){

                cows++;
                map.put(c2,map.get(c2)-1);
            }

        }
        return Integer.toString(bulls)+"A"+Integer.toString(cows)+"B";
        
    }
}