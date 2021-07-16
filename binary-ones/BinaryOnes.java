public class BinaryOnes {
    public static void main(String[] args) {
        System.out.println(ones(2));
    }


    public static int ones(int x){

        int sum = 0;

        while (x > 0) {
            sum += x & 1;
            System.out.println("Sum: " + sum);
            x >>= 1;
            System.out.println("X: " + x);
        }

        return sum;
    }
}
