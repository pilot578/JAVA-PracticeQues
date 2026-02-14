public class TwoDimenArr {
    public static void main(String[] args){
        String[] fruits = {"orange", "apple", "banana"};
        String[] vegetable = {"potato", "carrot", "onion"};
        String[] meats = {"chicken", "pork", "fish"};
        String[][] groceries = {fruits, vegetable, meats};
        groceries[0][0] = "pineapple";
for(String[] foods : groceries){
    for(String food : foods){
    System.out.print(food + " ");
    }
System.out.println();
    }
}
}
