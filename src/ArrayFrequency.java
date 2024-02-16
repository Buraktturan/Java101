import java.util.Arrays;

public class ArrayFrequency {
    public static void main(String[] args) {
        int [] list = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);
        int tekrarSayisi = 1;
        for(int i = 0; i < list.length-1; i++) {
            if(list[i] == list[i + 1]) {
                tekrarSayisi++;
            } else {
                System.out.println(list[i] + " sayısı " + tekrarSayisi + " kere tekrar edildi.");
                tekrarSayisi = 1;
            }
        }
        System.out.println(list[list.length-1] + " sayısı " + tekrarSayisi + " kere tekrar edildi.");
    }
}
