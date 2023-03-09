import java.util.*;

public class getPosThree{
    public static void main(String args[]){
        int a[]={-3,4,5,8,9,2,1,-6,6};
        int n=a.length; //count=0;
        ArrayList<Integer> b=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(a[i]>0){
                b.add(a[i]);
            }
        }
            for(int i =0;i<b.size()-1;i++){
                //System.out.println("\n"+b.get(i));
                for(int j=0;j<n-i-1;j++){
                    if(a[j]>a[j+1]){
                            a[j]=a[j]+a[j+1];
                            a[j+1]=a[j]-a[j+1];
                            a[j]=a[j]-a[j+1];
                    }
                    
                }
            }

       // Collections.sort(b);

        int count=b.get(0);
        


    for(int i : b){
    System.out.println(i);
            /*if(i==count)
            count++;
            else{
                break;
            } */  
        }

        
 //System.out.println("\n"+count);
        }
        

    }