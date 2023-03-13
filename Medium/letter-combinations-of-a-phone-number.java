class Solution {
    String[] arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0) return ans;
        for(int i=0;i<arr[digits.charAt(0)-'0'].length();i++){
            String c=arr[digits.charAt(0)-'0'].substring(i,i+1);
            ans.add(c);
        }
        
        return helper(digits,1,ans);
        
    }
    public List<String> helper(String digits,int i, List<String> ans) {
        if(i>=digits.length()) return ans;

         int idx=digits.charAt(i)-'0';
        int size=ans.size();

        for(int j=0;j<size;j++){
        String s=ans.get(0);
        System.out.println(s);
        
        for(int k=0;k<arr[idx].length();k++){
            String c=Character.toString(arr[idx].charAt(k));
            ans.add(s+c);
            
        System.out.println(ans);
        }
        ans.remove(0);
   
        }
        return helper(digits,i+1,ans);

    } 
}