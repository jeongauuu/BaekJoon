import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
		int M = scanner.nextInt();
        
        int n = H*60+M-45;
        
        if(n<0){
        	n += 1440;
        }
        System.out.printf("%d %d", n/60, n%60 );
    }    
}