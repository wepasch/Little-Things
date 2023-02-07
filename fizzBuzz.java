class fizz{
	public static void main(String[]args) {
		for (int i = 1; i <= 100; i++) {
			ev(i);
			System.out.println();
		}
	}

	public static void ev(int x) {
		boolean num = true;
		
		if ((x % 3) == 0) {
			num = false;
			System.out.print("Fizz");
		}
		if ((x % 5) == 0) {
			System.out.print("Buzz");
			num = false;
		}
		if (num) {
			System.out.print(x);
		}

	}

}
