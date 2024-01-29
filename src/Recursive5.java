public class Recursive5 {
    public static void main(String[] args) {
        recursiveMethod(20);
    }

    public static void recursiveMethod(int n){
        System.out.println(n);

        if (n<=0){
            System.out.println(n);
            return;
        }
        recursiveMethod(n-5);
        System.out.println(n);
    }
}
