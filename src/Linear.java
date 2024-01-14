public class Linear {
    // Linear Search Algorithm

        public static void main(String[] args) {
            int arr[]={3,14,22,23,4,45,56,5,42};
            int target =23;
            int a= linSearch(arr,target);
            System.out.println(a);
        }
        static int linSearch(int arr[], int target){
            for(int i=0; i< arr.length; i++){
                if(arr[i] == target){
                    return i;
                }
            }
            return -1;
        }

}
