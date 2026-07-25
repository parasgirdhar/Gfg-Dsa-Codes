class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        
        int min =arr[0];
        int max=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        
        ArrayList<Integer>List = new ArrayList<>();
        
        List.add(min);
        List.add(max);
        
        return List;
        
    }
}
