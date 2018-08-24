
public class fizzbuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=50;i++)
		{
			if(i%3==0)
			{
				System.out.println("fizz:" +" " +i);
			}
			if(i%5==0)
			{
				System.out.println("buzz"+" " +i);
			}
			if(i%3==0 && i%5==0)
			{
				System.out.println("fizzbuzz"+" " +i);
			}
		}
		
	}

}
output:
fizz: 3
buzz 5
fizz: 6
fizz: 9
buzz 10
fizz: 12
fizz: 15
buzz 15
fizzbuzz 15
fizz: 18
buzz 20
fizz: 21
fizz: 24
buzz 25
fizz: 27
fizz: 30
buzz 30
fizzbuzz 30
fizz: 33
buzz 35
fizz: 36
fizz: 39
buzz 40
fizz: 42
fizz: 45
buzz 45
fizzbuzz 45
fizz: 48
buzz 50
