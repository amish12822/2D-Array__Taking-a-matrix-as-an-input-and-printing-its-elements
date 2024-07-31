import java.util.Scanner;

/**
 * print
 */
public class print {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row size: ");int r = sc.nextInt();

        System.out.print("Enter column size: ");int c = sc.nextInt();

        int num[][] = new int[r][c];

        // input
        System.out.println("Input Array value: ");
        for (int i=0; i<r; i++){
            
            for (int j=0; j<c; j++){

                System.out.print("Store value in ( " + i + " , " + j + " ) : " );num[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // output
        System.out.println("Print Array value: ");
        for (int i=0; i<r; i++){
            
            for (int j=0; j<c; j++){

                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}