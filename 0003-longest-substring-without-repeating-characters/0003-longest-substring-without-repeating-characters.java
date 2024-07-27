class Solution {
    public int lengthOfLongestSubstring(String  s) {
        HashMap<Character,Integer> hmap=new HashMap<>();
        int i=0,j=0,ml=0;
        while(j<s.length()){
            if(hmap.containsKey(s.charAt(j))){
               hmap.put(s.charAt(j),hmap.get(s.charAt(j))+1);
            }else{
               hmap.put(s.charAt(j),1);
            }
            
            if(hmap.size()==j-i+1){
               ml=Math.max(ml,j-i+1);
               j++;
            }else if(hmap.size()<j-i+1){
               while(hmap.size()<j-i+1){
                   hmap.put(s.charAt(i), hmap.get(s.charAt(i))-1);
                   if(hmap.get(s.charAt(i))==0){
                       hmap.remove(s.charAt(i));
                   }
                   i++;
                }
               j++;
            } 
        }
        return ml;
    }
}