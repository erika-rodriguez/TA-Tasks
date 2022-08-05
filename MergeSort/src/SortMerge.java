import java.util.Scanner;

public class SortMerge {
    public static void main(String[] args) throws Exception {
        System.out.println("Insert array length:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Insert number to the array:");
            arr[i]=sc.nextInt();
        }
        
		SortMerge ob=new SortMerge();
		ob.mergeSort(arr,0,arr.length-1);
		ob.display(arr);
    }

    void merge(int arr[], int left, int middle, int right){
        int low=middle-left+1;
        int high=right-middle;

        int L[]= new int[low];
        int R[]=new int[high];

        int i=0, j=0;
        for (i=0; i<low; i++){
            L[i]=arr[left+i];
        }
        for (j=0; j<high; j++){
            R[j]=arr[middle+1+j];
        }

        int k=left;
        i=0;
        j=0;

        while (i<low && j<high){
            if(L[i]<=R[j]){
            arr[k]=L[i];
            i++;
            }
            else{
            arr[k]=R[j];
            j++;
            }
        k++;
        }

        while(i<low){
            arr[k]=L[i];
            i++;
            k++;
        }

        while(j<high){
            arr[k]=R[j];
            j++;
            k++;
        }
}
void mergeSort(int arr[], int left, int right){
    int middle;
    if(left<right){
        middle=(left+right)/2;

        mergeSort(arr, left, middle);
        mergeSort(arr, middle+1, right);

        merge(arr, left, middle, right);
    }
}

void display(int arr[]){
    System.out.println("The sorted array is:");
    for (int i=0; i<arr.length; i++){
        System.out.print("["+arr[i]+"]");
    }
}
}
