package day2.firedrill1;

public class Task8{
	public static void main(String[] args){
		int sum = 0;
		int i = 0;
		while(i++ < 100) {
			if(i % 4 == 0) sum += i + i*i + i*i*i + i*i*i*i + i*i*i*i*i;
		}
		System.out.printf("%d ", sum);
	} 

}

