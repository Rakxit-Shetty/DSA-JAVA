public class binsrc{
    public static void main(String args[]){
        int[] a={1,2,3,4,5,6,7,8};
        int target=7,lb=0,up=a.length-1,mid=0;
        boolean flg=false;
                
        while(lb<=up){
            mid=(lb+up)/2;
            
            if(a[mid]<target){
                lb=mid+1;

            }
            else if(a[mid]>target){
                up=mid-1;
            }
            else{
                System.out.println("index:"+(mid+1));
                 break;
            }
            
        }
        if(lb>up){
        System.out.println("not found");
       
        }
    }
}