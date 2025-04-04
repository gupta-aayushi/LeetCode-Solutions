class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> s = new HashSet<>();
        for(int i: map.values()){
            s.add(i);
        }
        return map.size()==s.size();
    }
}