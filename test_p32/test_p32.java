package test_p32;



public class test_p32 {
	public static void main(String[]args) throws CarException
	{
		Car car1;
		car1= new Car();
		
		car1.setCar(1234,-10.0);
		
		car1.show();
	}
}


 class CarException extends Exception {

}

class Car
{
	private int num;
	private double gas;
	
	
	public Car()
	{
		num=0;
		gas=0.0;
		System.out.println("已升產了汽車");
	}
	
	public void setCar(int n,double g)throws CarException
	{
		if(g<0)
		{
			CarException e =new CarException();
			throw e;
			
		}else
		{
			num=n;
			gas=g;
			System.out.println("將車號設為"+num+"汽油量設定為"+gas);
		}
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	

	
}

/*class Car
{
	private int num;
	private double gas;
	
	
	public Car()
	{
		num=0;
		gas=0.0;
		System.out.println("已升產了汽車");
	}
	
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		
		System.out.println("將車號設定為"+num+"汽油量設定為"+gas);
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	

	
}*/

