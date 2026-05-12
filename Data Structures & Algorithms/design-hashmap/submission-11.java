class MyHashMap {
    private List<int[]> lst;

    public MyHashMap() {
        lst = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        int[] element = new int[]{key, value};
        for (int[] ele : lst){
            if (key == ele[0]) {
                ele[1] = value;
                return;
            }
        } 
        lst.add(element);        
    }
    
    public int get(int key) {
        for (int[] ele : lst){
            if (key == ele[0]) {
                return ele[1];
            }
        }  
        return -1;     
    }
    
    public void remove(int key) {
        Iterator<int[]> it = lst.iterator();
        while (it.hasNext()){
            int[] ele = it.next();
            if (ele[0] == key) {
                it.remove();
                return;
            }
        }             
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */