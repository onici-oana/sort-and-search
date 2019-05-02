public class Main {

    public static void main(String[] args) {

        int[] numere = {8,4,9,1,2,222};
        int k=-1,aux=0,n=9;
        int mij=numere.length;
        for(int i=0;i<numere.length-1;i++) {
            for (int j = 0; j < numere.length-i-1; j++) {
                if (numere[j] > numere[j+1]) {
                    aux = numere[j];
                    numere[j] = numere[j+1];
                    numere[j+1] = aux;
                    k++;
                }

            }
            k=0;
        }
        //if(k==0) {
        // for (int m = 0; m < numere.length; m++)
        //   System.out.print( numere[m] + " ");
        //}else
        //System.out.println("The array is not sorted");

        for(int i=0;i<mij-1;i++)
        {
            if(numere[i]==n)
            {
                System.out.println("The number has been found and it is: "+numere[i]); k=1;
                break;}
        }
        for(int j=mij;j<numere.length;j++)
        {
            if(numere[j]==n)
            {
                System.out.println("The number has been found and it is: "+numere[j]); k=1;
                break;}
        }
        if(k!=1)
            System.out.println("The number can't be found");
    }
}
