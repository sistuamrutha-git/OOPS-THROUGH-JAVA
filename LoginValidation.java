package oops;

public class LoginValidation {
static void validateLogin(String username, String password)
{
	if(!username.equals("admin") || !password.equals("1234"))
{
	throw new SecurityException("Invalid username or password!");
}else
{
System.out.println("Login Successful!");	
}
}
public static void main(String[] args)
{
	try
	{
		validateLogin("admin","1111");
	}
	catch(RuntimeException e)
	{
		System.out.println("Wrong login:"+e.getMessage());
	}

try
{
	validateLogin("admin","1234");
}
catch(RuntimeException e)
{
	System.out.println("correct login:"+e.getMessage());
}
}
}

