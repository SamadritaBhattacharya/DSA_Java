package Searching.BinarySearch;

public class Greatest_Letter {

    //find smallest letter greater than the target
    //the letters are wrapped around

    static char greatLetter(char letters[], char target){

        int start=0; int end = letters.length -1;

        while(start<= end){
            int mid = start + (end-start)/2;
            if(target <letters[mid]){
                end = mid+1;
            }
            else if (target>letters[mid]){
                start= mid + 1;
            }
        }
        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        char letters[] = {'c','f','j'};
        char target = 'f';
        char ans = greatLetter(letters , target);
        System.out.println(ans);
    }
}
