class Solution 
{
    public void reverseArray(int arr[]) 
    {
        int n=arr.length;               // 1-> Arr Size Using arr.length
        int index=n-1;                  // 2-> index set to end of Array
        int reverse[]=new int[n];       // 3-> Create New Array To Add Elements In reverse Order
        
        for(int i=0;i<n;i++)            // 4-> Loop Through Array From Start To End
        {
            reverse[i]=arr[index];      // 5-> Store Array Elements In reverse Order in reverseArray
            index--;
        }
        for(int i=0;i<n;i++)            // 6-> Loop Through reverseArray and Store Elements in Original Array
        {
            arr[i]=reverse[i];
        }
        
    }
}

