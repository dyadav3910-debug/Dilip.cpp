public class recurtion2 {

    public static void printNumb(int n){
        if(n==6){ //base case
            return;
        }
        System.out.println(n);
        printNumb(n+1);//recursive call
    }

    public static void  main(string [] args){
        int n = 1;
        printNumb(n);//n=1
    }
}