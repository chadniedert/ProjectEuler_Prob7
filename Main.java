// Link: https://projecteuler.net/problem=7

class Main {
  public static void main(String[] args) {
	  
    
  }

  public boolean isPrime(int num)
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