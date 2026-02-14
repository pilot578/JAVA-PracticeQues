import java.util.Scanner;
public class Add2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B= new int[2][3];
        int[][] C = new int[2][3];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                A[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B[i].length;j++){
                B[i][j] = sc.nextInt();
        C[i][j] = A[i][j]+B[i][j];
            }
        }
        System.out.println("Result: ");
        for(int i =0;i<C.length;i++){
            for(int j=0;j<C[i].length;j++){
                System.out.print(C[i][j] + " ");
            }
             System.out.println();
        }
        sc.close();
        }
    }

