Arrays.sort(arr);

HashMap<Integer,Integer> map = new HashMap<>();
int r = 1;

for(int i = 0; i < arr.length; i++) {
    if(!map.containsKey(arr[i])) {
        map.put(arr[i], r++);
    }
}

for(int i = 0; i < arr1.length; i++) {
    arr1[i] = map.get(arr1[i]);
}

return arr1;
