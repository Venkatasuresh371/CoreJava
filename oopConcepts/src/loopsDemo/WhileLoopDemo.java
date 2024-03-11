package loopsDemo;

public class WhileLoopDemo 
{
	public String findElementInArr(int arr[], int elementTobeFound) 
	{
		int i = 0;
		while (i < arr.length) 
		{
			if (arr[i] == elementTobeFound) 
			{
				return elementTobeFound+" IS PRESENT IN THE ARRAY ";
			}
			i++;
		}
		return "SORRY!.... " + elementTobeFound + " IS NOT PRESENT IN THE ARRAY";
	}

	public static void main(String[] args) {
		int a[] = { 34, 568, 3298, 549, 23, 45 };
		WhileLoopDemo demo = new WhileLoopDemo();
		String findElementInArr = demo.findElementInArr(a,549);
		System.out.println(findElementInArr);
	}

}
