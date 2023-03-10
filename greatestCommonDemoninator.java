class greatestCommonDemoninator{
	public static void main(String[]args) {
		int a = 101;
		int b = -16;

		if (args.length > 0) {
			a = Integer.valueOf(args[0]);
		}
		if (args.length > 1) {
			b = Integer.valueOf(args[1]);
		}

		System.out.println("gcd(" + a + ", " + b + ") = " + gcd(a, b));
	}

	public static int gcd(int a, int b) {
		if (a < 0) {a *= -1;}
		if (b < 0) {b *= -1;}
		
		if (b > a) {
			int temp = b;
			b = a;
			a = temp;
		}
		
		if (b == 0) {
			return a;
		}
		
		return gcd(b, a % b);
	}

}
