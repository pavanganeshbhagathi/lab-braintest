package service;



public class PersonalityCalculator{
	
	
	public String findYourBrain(String options)
	{
		
		int a[]=findAnswers(options);
		int A=a[0]+a[1]+a[2]+a[4]+a[7]+a[9]+a[10]+a[11]+a[13]+a[17]+a[19];
		
		int B=a[3]+a[5]+a[6]+a[8]+a[12]+a[14]+a[15]+a[16]+a[18];
		
		
		int X=66-A+B;
		
    System.out.println("Yor total score"+X);
    
    if(20<=X&&X<=55) {
		 return "Left-Brained";
	 }else if(56<=X&&X<=64)
	 {
		return "No clear preference"; 
	 }else if(65<=X&&X<=100)
	 {
		 return "Right-brained";
	 }else
	 {
		 return "smething wrong";
	 }


	}

	private int[] findAnswers(String options) {
		 String c[]=options.split(",");
		 int n=c.length;
		int array[]=new int[n];
		int i=0;
		for(String s:c)
		{
			array[i]=Integer.parseInt(s);
			i++;
			
		}
		
		
		return array;
	}
	
}