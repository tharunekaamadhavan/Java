public class MergeSort {
    static void merge(int a[] , int start , int mid , int end){
        int leftArraySize= mid - start+1; // finding left array size
        int ri8ArraySize =  end- mid;// finding right array size
        int leftArray []= new int[leftArraySize]; // left array
        int ri8Array []= new int[ri8ArraySize];// right array
        for(int i=0;i<leftArraySize ;i++){
            leftArray[i]=a[start+i];    // assigning original arrays left elemnets to left array
        }
        for(int i=0;i<ri8ArraySize ;i++){
            ri8Array[i]=a[mid+i+1];// assigning original arrays right elemnets to right array
        }
        int i=0 , j=0 ,k =start; // comparision variables i-leftarray ,j- ri8Array , k - original array
        // comparing left and right array elemnts and asiigning them to original array
        while(i<leftArraySize && j< ri8ArraySize){
            if(leftArray[i] < ri8Array[j]){
                a[k]=leftArray[i]; // assigning left values
                i++;
            }
            else
            {
                a[k]= ri8Array[j]; // assigning right values
                j++;
            }
            k++;// increasing original array index position to insert next element

        }
        // loop for assigning left side array left out assigning to original array
        while(i<leftArraySize){
            a[k]=leftArray[i];
            i++; k++;
        }
        // loop for assigning ri8 side array left out assigning to original array
        while(j<ri8ArraySize){
            a[k]=ri8Array[j];
            j++; k++;
        }



    }
    static void divide(int a[] , int start , int end){
        if(start<end){
            int mid = (start+end)/2;   // start+(end-start)/2; // mid point finding
            divide(a,start , mid); // diving range call for first half(left subarray)
            divide(a,mid+1, end);// diving range call for second half(right subarray)
            merge(a, start , mid ,end); // diving and merging
        }
    }
    public static void main(String[] args) {
        int a[]= {5,1,6,8,1,4,7,1,6,5,7,34,7,23,56,76,39,3,2,5,10,48,28,184};
        divide(a,0,a.length-1);

        for(int i=0;i<a.length ; System.out.print(a[i++]+" "));
    }
}
