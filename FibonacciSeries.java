package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int range=8;
int firstNum=0;
int secNum=1;
System.out.println("firstNum"+0);
for(int i=1;i<=8;i++) {
	int sum=firstNum+secNum;
	firstNum=secNum;
	secNum=sum;
	System.out.println(sum);
}

	}

}
