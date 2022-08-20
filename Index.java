import java.util.*;
public class Index
{    
    public static void main(String args[])
    {
        int arr[] = { 9, 5, 7, 8, 6, 3};
        Arrays.sort(arr);
        System.out.print("Array: ");
        printArray(arr);
        System.out.println("Enter item to search: ");
        Scanner scan = new Scanner(System.in);
        int item = scan.nextInt();
        int index = search(arr,0,arr.length,item);
        if(index == -1)
            System.out.println("Index not found for the entered element "+item);
        else
            System.out.println("Entered element "+item+" is present at index "+index);
    }
    static void printArray(int arr[])
    {
        for(int i = 0; i < arr.length ; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    static int search(int arr[], int l, int r, int item)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == item)
                return mid;
            if (arr[mid] > item)
                return search(arr, l, mid - 1, item);
            return search(arr, mid + 1, r, item);
        }
        return -1;
    }
}