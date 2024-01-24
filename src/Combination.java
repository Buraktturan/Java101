import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {

        int n,r;
        int nfact=1;
        int rfact=1;
        int nrfact=1;
        int total=1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=scan.nextInt();
        System.out.print("Enter other number: ");
        r=scan.nextInt();
        for(int i=1;i<=n;i++){
            nfact=nfact*i;
        }
        for(int k=1;k<=r;k++){
            rfact=rfact*k;
        }
        for(int i=1;i<=(n-r);i++) {
            nrfact = nrfact * i;
        }
                total= (nfact) / (rfact*(n-r));
        System.out.println(total);
    }
}
