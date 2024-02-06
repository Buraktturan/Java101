public class ArrayHarmonic {
    public static void main(String[] args) {
        double[] list = {1,2,3,4,5};
        double harmonicsum=0.0;
        for (int i =0;i< list.length;i++){
            harmonicsum+=1+(1/list[i]);
        }
        System.out.println(list.length/harmonicsum);
    }
}
