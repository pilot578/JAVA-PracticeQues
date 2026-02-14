
import java.util.Scanner;
public class Multiply2D {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];
        int[][] arr3 = new int[2][2];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr3[i][j]=0;
                for(int k =0;k<arr1[i].length;k++){
                    arr3[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
System.out.println("Result: ");
for(int i=0;i<arr3.length;i++){
    for(int j=0;j<arr3[i].length;j++){
        System.out.print(arr3[i][j]+ " ");
    }
    System.out.println();
}
sc.close();
    }
}
