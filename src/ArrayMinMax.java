import java.util.Arrays;
import java.util.Scanner;
public class ArrayMinMax {
    public static void main(String[] args) {
        int number,minNumber=0,maksNumber=0;
        int [] list = {15,12,788,1,-1,-778,0};
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı Giriniz!");
        number=scan.nextInt();
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        for (int i : list) {
            if (i<number){
            minNumber=i;
            }
        }
        for (int j : list){
            if (j>number){
                maksNumber=j;
                break;
            }
        }
        System.out.println("Girilen Sayı : " + number);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + minNumber);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + maksNumber);
    }
}
