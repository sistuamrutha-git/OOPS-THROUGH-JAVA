package oops;

public class Throw {
static void checkAge(int age)
{
	if(age < 18) {
		throw new ArithmeticException("Access denied-You must be atleast 18 years old");
	}
	else
	{
		System.out.println("Acces granted-You are old enough!");
	}
}
public static void main(String[] args) {
	checkAge(15);
}
}
