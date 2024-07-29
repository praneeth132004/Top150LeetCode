class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int i=0,j=0,mf=0;
        if(fruits.length==1){
           return 1;
        }
        while(j<fruits.length){
            if(hmap.containsKey(fruits[j])){
               hmap.put(fruits[j] ,hmap.get(fruits[j])+1);
            }else{
               hmap.put(fruits[j],1);
            }
            if(hmap.size()<2){
                j++;
            }else if(hmap.size()==2){
                 mf=Math.max(j-i+1,mf);
                 j++;
            }else if(hmap.size() > 2){
                  while(hmap.size() > 2){
                      hmap.put(fruits[i], hmap.get(fruits[i])-1);
                      if(hmap.get(fruits[i])==0){
                          hmap.remove(fruits[i]);
                      }
                      i++;
                  }
                j++;
            }
        }
        if(hmap.size()==1){
            return hmap.get(fruits[0]);
        }
        return mf;
   }
}