public class Array3 {
    public static void main(String[] args)
    {
        double[] a=new double[5];
        a[0]=12.34d;
        a[1]=34.54d;
        a[2]=76.98d;
        a[3]=98.22d;
        a[4]=83.73d;
        double sum=0;
        double mean=0;

        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            mean=sum/a.length;
        }
        System.out.println("The sum of elements : "+sum);
        System.out.println("The average of elements : "+mean);
    }
}
