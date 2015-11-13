 public class arrayRecursion {
     

 public static int linSearch(int[]arr,int target,int pos) {
     System.out.println("value of pos= "+pos);
        if(pos==arr.length) {
            return -1; //Target not found
        }
        else if(arr[pos]==target) {
            return pos;  //Target found
        }
        else {
           return linSearch(arr,target,pos+1); //recursive call
        }
        
        
    }
 
  public static void main(String[] args) {
      int[] array1={10,9,6,7,5,1,2,3,4,5};
      System.out.println(linSearch(array1,6,0));
    
    
    
      
   int[] a = {10,8,3,-4,0,1,100,50,22,-5};
for (int i=1; i<a.length; i++){ 
    for (int j=i; (j>0 && (a[j] < a[j-1])); j--){
      int tmp = a[j];
      a[j]=a[j-1];
      a[j-1]=tmp;
    }
  }

  }

 }