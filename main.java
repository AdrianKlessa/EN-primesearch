package primesearch;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		int value = Integer.parseInt(input);
		
		boolean flag=false;
		
		for (int x=2;x<=value;x++)
		{
			flag=false;
			for (int y=2;y<=x/2;y++)
			{
				if(x%y==0)
				{
					flag=true;
					break;
				}	
							
			}
			if (flag==false)
			{
				System.out.println(x);
			}
			
		}
		scan.close();
		
		
		
		
	}

}
