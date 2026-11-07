class Solution {
    public List<String> letterCombinations(String digits) {
     List<String> ans = new ArrayList<>();
        int n = digits.length();

        Map<Integer, List<Character>> map = new HashMap<>();
        map.put(2, new ArrayList<>(Arrays.asList('a', 'b', 'c')));
        map.put(3, new ArrayList<>(Arrays.asList('d', 'e', 'f')));
        map.put(4, new ArrayList<>(Arrays.asList('g', 'h', 'i')));
        map.put(5, new ArrayList<>(Arrays.asList('j', 'k', 'l')));
        map.put(6, new ArrayList<>(Arrays.asList('m', 'n', 'o')));
        map.put(7, new ArrayList<>(Arrays.asList('p', 'q', 'r', 's')));
        map.put(8, new ArrayList<>(Arrays.asList('t', 'u', 'v')));
        map.put(9, new ArrayList<>(Arrays.asList('w', 'x', 'y', 'z')));

        if(n == 1){
            int butt = digits.charAt(0) - '0';
            List<Character> temp = map.get(butt);
            for(char ch : temp){
                ans.add(ch + "");
            }
        }
        else if(n == 2){
          int butt1 = digits.charAt(0) - '0';
            int butt2 = digits.charAt(1) - '0';
            List<Character> list1 = map.get(butt1);
            List<Character> list2 = map.get(butt2);
            for(char ch1 : list1){
                String s = ch1 + "";
                for(char ch2 : list2){
                    ans.add(s + (ch2 + ""));
                }
            }
        }
        else if(n == 3){
            int butt1 = digits.charAt(0) - '0';
            int butt2 = digits.charAt(1) - '0';
            int butt3 = digits.charAt(2) - '0';
            List<Character> list1 = map.get(butt1);
            List<Character> list2 = map.get(butt2);
            List<Character> list3 = map.get(butt3);

            for(char ch1 : list1){
                String s1 = ch1 + "";
                for(char ch2 : list2){
                    String s2 = s1 + (ch2 + "");
                    for(char ch3 : list3){
                        ans.add(s2 + (ch3 + ""));
                    }
                }
            }
        }
        else if(n == 4){
            int butt1 = digits.charAt(0) - '0';
            int butt2 = digits.charAt(1) - '0';
            int butt3 = digits.charAt(2) - '0';
            int butt4 = digits.charAt(3) - '0';
            List<Character> list1 = map.get(butt1);
            List<Character> list2 = map.get(butt2);
            List<Character> list3 = map.get(butt3);
            List<Character> list4 = map.get(butt4);

            for(char ch1 : list1){
                String s1 = ch1 + "";
                for(char ch2 : list2){
                    String s2 = s1 + (ch2 + "");
                    for(char ch3 : list3){
                        String s3 = s2 + (ch3 + "");
                        for(char ch4 : list4){
                            ans.add(s3 + (ch4 + ""));
                        }
                    }
                    
                }
            }
        }

        return ans;
    }
}     
        
    