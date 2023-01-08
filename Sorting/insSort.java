public class insSort{

    public static void main(String args[]){
        int a[]={2,3,1,5,8,7,90,55};
        int cur,n=a.length;

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