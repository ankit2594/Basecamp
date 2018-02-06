package CutSticks;

public class Main {

	public static void main(String[] args) {
    int arr[] ={1,2,3,4,3,3,2,1};
    int [] brr=Logic.cutSticks(arr);
    for(int a:brr)
    {
    	System.out.println(a);
    }

	}

}
