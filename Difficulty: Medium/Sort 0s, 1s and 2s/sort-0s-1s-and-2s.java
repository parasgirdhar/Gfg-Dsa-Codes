class Solution {
    public void sort012(int[] arr) {
       
     PriorityQueue<Integer> Heap = new PriorityQueue<>();
     
     for(int i=0;i<arr.length;i++){
         Heap.add(arr[i]);
     }
     
     int i=0;
     
     while(Heap.isEmpty() == false){
         arr[i] = Heap.poll();
         i++;
     }
     
        return ;
    }
}