import static java.lang.Math.*;
public class Lab1 {
    public static void main(String[] args){
        // v338861
        int counter=0;
        for(int i=6;i<=18;i++)
            if(i%2 == 0)
                counter++;
        // создание первого массива
        long[] b = new long[counter];
        for(int i=0;i<counter;i++)
            b[i] = i * 2 + 6;

        // создание второго массива
        float[] x = new float[11];
        for(int i=0;i<x.length;i++)
            x[i] = (float)random() * 14 - 10; // [0,1)

        // создание третьего массива
        final int A_COLUMNS = 11;
        final int A_STRINGS = 7;
        float[][] a = new float[A_STRINGS][A_COLUMNS];
        for(int i=0;i<A_STRINGS;i++)
        {
            for(int j=0;j<A_COLUMNS;j++)
            {
                if(b[i] == 10)
                    a[i][j] = (float)sin( pow(0.5 * pow((x[j] - 1) / 0.25, 2), 3));
                else if(b[i] == 6 || b[i] == 14 || b[i] == 16)
                    a[i][j] = (float)atan(0.4 / exp(abs(x[j])));
                else
                    a[i][j] = (float)exp(pow( 3 / (pow((pow(x[j]+1, 2) + 0.5) / 4, 3)),2));

                if(j == 0)
                    System.out.printf("%11.4e",a[i][j]);
                else
                    System.out.printf("%15.4e",a[i][j]);
            }
            System.out.println();
        }
    }
}