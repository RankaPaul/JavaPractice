public class CheckEvenOddFrom1To100 {
    public static void main(String[] args) {
        int num= 100;

        for(int i = 1; i<=num; i++){
            if(i%2==0){
                System.out.println("Even number: "+i);
            }else {
                System.out.println("Odd number: "+i);
            }
        }
    }
}
