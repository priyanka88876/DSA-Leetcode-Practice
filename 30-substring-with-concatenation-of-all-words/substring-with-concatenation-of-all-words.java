class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
              List<Integer> res = new ArrayList<>();
        int  wlen = words[0].length();

        if(s.length() == 0){
            return new ArrayList<>();
        }

        Map<String, Integer> count = new HashMap<>();

        for(String str : words) {
            count.put(str,count.getOrDefault(str, 0) + 1 );
        }
//check for all offset
        for(int i = 0; i < wlen; i++){
            
            int left = i;
            int right = i;
            HashMap<String, Integer> curr = new HashMap<>();
            int con = 0;

           

            while(right + wlen <= s.length()){

            String word = s.substring(right, right + wlen);
            right += wlen;

 //check a word in string which is not in words array then move a window of leftside to right
                if(!count.containsKey(word)) {

                    curr.clear();
                    con = 0;
                    left = right;
                    continue;
                }
                //if word is there then put this in a current map and increase a count
                curr.put(word, curr.getOrDefault(word, 0) + 1);
                con++;


                //check a freq of current if freq is more then a requre then slide a window of leftside
                while(count.get(word) < curr.get(word)){

                    String leftWord = s.substring(left, left + wlen);

                    curr.put(leftWord,curr.get(leftWord) - 1);
                    con--;
                    left += wlen;
                }

  //if corrent word in map is equal to a all words then put window frist index in left and slide a window to right
                if(con == words.length){
                    res.add(left);

                    String leftWord = s.substring(left, left + wlen);

                    curr.put(leftWord,curr.get(leftWord) - 1);
                    left += wlen;
                    con--;
                }
            }
        }
        return res;  

    }
}
