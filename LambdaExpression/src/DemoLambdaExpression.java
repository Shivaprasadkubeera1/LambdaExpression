public class DemoLambdaExpression {
	public static void main(String[] args) {
		Calculator c = (a,b) -> 
		{
			System.out.println("Addition is="+(a+b));
			System.out.println("Difference is="+(a-b));
			System.out.println("Product is="+(a*b));
			System.out.println("Division is="+(a/b));
		};
		c.add(100, 20);
	}
}
