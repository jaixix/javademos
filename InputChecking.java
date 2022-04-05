
public class InputChecking {

	public static void main(String[] args) {
		int c = 0;
		System.out.println("List of prime nos. from 10 to 40 :");
		for(int i=10; i<=40; i++) {
			if(isPrime(i)) {
				System.out.println(i);
				c += 1;
			}
			if(c==4)
				break;
		}
		System.out.println("Total Prime nos. : " + c);
	}
	
public static boolean isPrime(int n) {
        
        if (n==1) {
            return false;
        }
        
        for (int i=2; i<= n/2; i++) {
            if (n % i == 0)
                return false;
        }
        
        return true;
        
    }
}
