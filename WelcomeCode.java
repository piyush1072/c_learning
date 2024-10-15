class WelcomeCode{
	public static void main(String args[]){
		System.out.println("I am piyush , Starting java");
		String firstname;
		firstname = "Piyush";
		String lastname = "Abhishek";
		System.out.println(firstname +" "+ lastname);
		int n1= 25;
		int n2= 13;
		double n3= 10.25;
		System.out.println(n1+n2);
		// System.out.println(n1+n3); // incompatible types: possible lossy conversion from double to float : float n3= 10.25;
		double n4= 14.25;
		System.out.println(n3+n4);
		System.out.println(n1+n4);
		int n5,n6;
		n5 = n6= 7;
		System.out.println(n5+n6);
		char a= 'A',b ='B';
		System.out.println(a);
		//System.out.println(a+b) //output 131 why???
		boolean booleanVariable= true;
		System.out.println(booleanVariable);  

		areaOfReactangle(n1,60); //function call with arguments
		parameterofRect(55,50);
		double para = parameterofRect2(10,20.5);
		System.out.println(para);
		boolean store = evenorodd(50);
		System.out.println(store);
		int arr[] =	{45,90,16,23};
		for(int i = 0;i<=3; i++){
			boolean store1 = evenorodd(arr[i]);
			System.out.print(store1+ " , ");
		}

	}

	//---------FUNCTION ----------
	public static void areaOfReactangle(double length,double breadth){     //function define but it should call inside main to excute with [arameters]
		double area;
		area = length * breadth;
		System.out.println(area);
	}


	public static void parameterofRect(double length, double breadth){
		double  parameter;
		parameter = 2 * ( length + breadth );
		System.out.println(parameter);
	}

	public static double parameterofRect2(double length, double breadth){
		double  parameter;
		parameter = 2 * ( length + breadth );
		return parameter;
	}

	public static boolean evenorodd(int n){
		int check = n%2;
		if(check == 0){
			return true;
		}
		else
			return false;
	}

}