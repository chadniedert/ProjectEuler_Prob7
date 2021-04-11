// Link: https://projecteuler.net/problem=7

class Main {
	public static void main(String[] args) {
		int count = 0;
		int target = 6;
		int number = 2;

		while (count != target)
		{
			if (isPrime(number))
			{
				count++;
			}
			number++;
		}

		System.out.println("The " + target + "th prime is " + (number - 1));
	}

	public static boolean isPrime(int num)
	{
		for (int i = 2; i < num; i++)
		{
			if (num % i == 0 && num != i)
			{
				return false;
			}
		}

		return true;
	}
}