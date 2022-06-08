package corejava_package;

public class ArrayExmp2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[3];
		arr[0] = 6;
		arr[1] = 2;
		arr[2] = 9;
		
		int min = 0;
		
		min = arr[0];
		for(int i=1;i<3;i++)
		{
			if(min>arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println(min);
	}

}
