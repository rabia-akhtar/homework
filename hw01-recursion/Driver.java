public class Driver {
    int ans = 0 ;
    public int fact (int n){
	if (n==0) return 1;
	else return n * fact(n-1);     
    }
    public int fibonacci(int n) {
	if (n==0) return 0; 
	else {

	    if (n<2) return 1;
	    else return fibonacci(n-1) + fibonacci (n-2);
	}
    }
    public int len(String s) {
	if (s.equals("")) return 0;
	else return 1 + len(s.substring(1));
    }
    public int count (String s, char c){
	if (s.equals("")) return 0;
	else if (s.charAt(0)==c) return 1+count(s.substring(1),c);
	else return count(s.substring(1),c);
    }
    public int bunnyEars2(int bunnies) {
	if (bunnies==0) return 0;
	else if (bunnies%2==0) return 3 + bunnyEars2 (bunnies-1);
	else return 2 + bunnyEars2 (bunnies-1);
    }
    public int sumDigits(int n) {
	if (n==0) return 0;
	else return (n % 10) + sumDigits(n/10);
    }

    public static void main (String args[]){
	Driver d = new Driver();
	System.out.println(d.fact(5));
	System.out.println(d.len("hello"));
	System.out.println(d.count("xasdxcx",'x'));
    }
}
