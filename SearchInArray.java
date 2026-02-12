public class  SearchInArray{
    public static void main(String[] args){
        int[] numbers = {2,4,1,5,8};
        int target = 5;
        for(int i=0;i<numbers.length;i++){
            if(target == numbers[i]){
                System.out.println("Element found at index: " + i);
                break;
            }
        }
        
    }
}
