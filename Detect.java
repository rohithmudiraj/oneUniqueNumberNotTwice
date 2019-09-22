package oneNumber;

public class Detect {
	
	public static void check(int[]a) {
		
		for(int i=0;i<a.length;i++) {
			int count=0;
		
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					//System.out.println(count);
				}
				else {
					
				}
			}
			if(count<=1) {
				System.out.println(a[i]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int[]  a= new int[] {4,3,2,4,1,3,2};
		
		Detect.check(a);
		
	}

}
