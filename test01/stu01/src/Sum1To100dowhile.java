public class Sum1To100dowhile {
    public static void main(String args[]){
        int i;
        int sum=0;

        i=1;
        do {
            sum=sum+i;
            i++;
        }while (i<=100);

        System.out.println("1+2+3+4+...+100="+sum);
    }
}
