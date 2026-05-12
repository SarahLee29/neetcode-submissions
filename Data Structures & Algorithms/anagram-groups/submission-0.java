class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        Map<String,List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();  
            Arrays.sort(chars);
            String key = new String(chars);
            if (map.containsKey(key)) {                    
                map.get(key).add(str);
            } else {
                List<String> subRes = new ArrayList<>();
                subRes.add(str);
                map.put(key,subRes);
            }
        }
        res = new ArrayList<>(map.values());
      
        return res;
    }
}
