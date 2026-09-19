//class Solution {
    //public List<Integer> partitionLabels(String s) {
      //xyxxy=5
      //zbzbb=5
      //i=1
      //s=1
      //l=1
      class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastIndex = new int[26];

        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            lastIndex[ch - 'a'] = i;
        }

        int start = 0;
        int boundary = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            boundary = Math.max(boundary,lastIndex[ch - 'a']);

            if (i == boundary){
                result.add(boundary - start + 1);
                start = boundary + 1;
                
            }
        }

        return result;
    }
}  
  //  }
//}
