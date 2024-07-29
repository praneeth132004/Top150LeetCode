class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         ArrayList<Integer> al=new ArrayList<>();
         for(int i=0;i<nums1.length;i++){
             Stack<Integer> st=new Stack<>();
             for(int j=nums2.length-1;j>=0;j--){ 
                  if(nums1[i]==nums2[j]){
                    if(st.empty()==false && st.peek() > nums2[j]){
                        al.add(st.peek());
                    }else{
                        while(st.size() > 0 && st.peek()<=nums2[j]){
                            st.pop();
                        }
                        if(st.size()==0){
                            al.add(-1);
                        }else{
                            al.add(st.peek());
                        }
                    }
                    
                    break;
                  }
                  st.push(nums2[j]);  
             } 
         }
        int[] newarr=new int[al.size()];
        for(int i=0;i<al.size();i++){
            newarr[i]=al.get(i);
        }
        return newarr;
    }
}