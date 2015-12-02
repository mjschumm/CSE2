//Mark Schumm
//Lab 11

public class SortArray {

    public static void main(String[] args) {
        int[] Array1 = new int[20];
         for(int i=0;i<20;i++){
            Array1[i]=(int)(Math.random()*100);
            //Creates array 1 with random numbers from 1 to 100
        }
         int[] Array2 = new int[10];
         for(int j=0;j<10;j++){
            Array2[j]=(int)(Math.random()*100);
            //creates array 2 with random numbers from 1 to 100
        }
        System.out.println("Array 1: ");
        for(int q=0;q<Array1.length;q++) {
        System.out.println(Array1[q]);
        }
        //prints out the unsorted array1
    System.out.println(" ");
    System.out.println("Array 1 Sorted: ");
            sort(Array1);
    //calls the sort method to print out array in ascending order
        System.out.println("Array 2: ");
       for(int r=0;r<Array2.length;r++) {
        System.out.println(Array2[r]);
        }
        //prints out the unsorted array 2
    System.out.println(" ");
    System.out.println("Array 2 Sorted: ");
    sort(Array2);
    int count=0;
    
    int[] Array3=new int[30];
    for(int s=0;s<20;s++) {
        Array3[count]=Array1[s];
        count++;
    }
      for(int t=0;t<10;t++) {
        Array3[count]=Array2[t];
        count++;
        //combines array 1 and 2 to make a third array of size 30
    }
     System.out.println("Array 3: ");
        for(int w=0;w<Array3.length;w++) {
        System.out.println(Array3[w]);
        }
        System.out.println(" ");
    System.out.println("Array 3 Sorted: ");
    sort(Array3);

    }
     public static void sort(int[]arr) {
         for(int k=0;k<(arr.length-1);k++) {
             for(int m=0;m<arr.length-k-1;m++) {
                 if (arr[m]>arr[m+1]) {
                     int tmp = arr[m];
                     arr[m]=arr[m+1];
                     arr[m+1]=tmp;
                     //Sorts the array in ascending order
                 }
             }
         }
         for(int l=0;l<arr.length;l++) {
         System.out.println(arr[l]);
         }
        System.out.println(" ");

    }
}
      