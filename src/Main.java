/*
Question : Write a program to print diamond pattern in given range.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        System.out.println("Enter the row to print diamond pattern :");
        rows = sc.nextInt();
        System.out.println("Printing the diamond pattern :");
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= rows -i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i*1-1; j++){
                System.out.print(" ");
            }
            for (int k = rows*2-1; k >=  i*2-1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}