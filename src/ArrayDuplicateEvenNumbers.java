import java.util.Arrays;
public class ArrayDuplicateEvenNumbers {

        static boolean isFind(int[] arr, int value){
            for (int i :arr) {
                if (i==value){
                    return true;
                }
            }
            return false;
        }
    public static void main(String[] args) {
            int[] list = {3,82,7,3,3,2,9,10,82,21,1,2,33,9,10,1};
            int[] duplicate =new int[list.length];
            int startIndex = 0;
            for (int i=0;i<list.length;i++){
                for (int j=0;j<list.length;j++){
                    if ((i!=j) && (list[i]==list[j])){
                        if (!isFind(duplicate,list[i])){
                            if (list[i]%2==0){
                                duplicate[startIndex++] =list[i];
                            }
                        }
                        break;
                    }
                }
            }
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(duplicate));
    }
}
