public class Fibonacci {
    public static void main(String[] args){
        int n0 = 1, n1 = 0, n2 = 5, n3;

        System.out.print(n0 + " " + n1 + " " + n2 + " ");

        for(int i = 1; i < 31; i++){
            n3 = n0 + n1 + n2;
            System.out.print(n3 + " ");
            n0 = n1;
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }

}