public class insSort{

    public static void main(String args[]){
        int a[]={2,3,1,5,8,7,9,55};
        int cur,n=a.length;
//0(n^2)
        for(int i=1;i<n;i++){
            cur=a[i];
            int j=i-1;
           while(j>=0 && a[j]>cur){
            a[j+1]=a[j];
            j--;
           }
           a[j+1]=cur;
                            }

        for(int i : a){
            System.out.println(i);
            }
    }   
}