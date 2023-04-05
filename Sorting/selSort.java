public class selSort
{

public static void main(String args[]){
int a[]={1,3,2,5,4,7,6};
int n=a.length;
//0(n^2)
for(int i=0;i<n;i++){
    int minpos=i;
    for(int j=0;j<n;j++){
        if(a[j]>a[minpos]){
            int temp=a[j];
            a[j]=a[minpos];
            a[minpos]=temp;
        }
    }
}
for(int i : a)
System.out.println(i);
}
}