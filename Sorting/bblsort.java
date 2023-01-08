public class bblsort{
public static void main(String args[]){
    int a[]={1,3,5,7,2};
    int n=a.length;
    for (int i =0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
                
                //SWAP
            if(a[j]>a[j+1]){
                a[j]=a[j]+a[j+1];
                a[j+1]=a[j]-a[j+1];
                a[j]=a[j]-a[j+1];
            }
        }
    }
    for (int i : a)
    System.out.print(i);

    
 }
}