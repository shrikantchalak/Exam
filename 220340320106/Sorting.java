class Sorting{
	
	static void sort(int arr[]){
		
		int low =0;
		int high = arr.lenghth-1;
		int temp =arr[high];
		for(int i=arr.length-2; i> low; i--){
			if(temp<arr[i]){
				int j =i;
				j++;
				arr[j] = arr [i];
				display(arr);
				
			}
			else{
				if(arr[i] < temp){
					arr[i]< temp;
					
				}
				display(arr);
				break;
			}
			
		}
	}
	
class Stack{
 

  public static void main(String[] args){
    TS ts = new TS(5);
    ts.push1(5);
    ts.push2(10);
    ts.push2(15);
    ts.push1(11);
    ts.push2(7);
    ts.push2(40);
    System.out.print("Popped element from stack2 is  "
                    + ": " +  ts.pop2()
                    +"\n");
  }
  
  static void display(int arr[]){
	  
	  for(int i=0; i<arr.length;i++){
		  System.out.ptintln(arr[i]+" ");
		  
	  }
	  System.out.ptintln();
  }
  
  public static void main(String[] args)
  
  int arr[] = {2,4,6,8,3};
  sort(arr);
}
}