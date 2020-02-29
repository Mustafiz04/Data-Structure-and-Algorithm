class Codesthaan { 
    public static int search(int arr[], int x) { 
	    int n = arr.length; 
	    for(int i = 0; i < n; i++) { 
            if(arr[i] == x) 
                return i; 
        } 
        return -1; 
    } 
    public static void main(String args[]) { 
        int arr[] = { 1,5,3,7,8,6,2,9,4 }; 
        int x = 2; 
        int result = search(arr, x); 
        if(result == -1) 
            System.out.print("Element is not present in array"); 
        else
            System.out.print("Element is present at index " + result); 
    } 
} 
