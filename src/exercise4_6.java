public class exercise4_6 {
    public static void main(String[] args) {
        int x =11;
        int y =324;
        int z =12;

        int min=0;
        int mid=0;
        int max=0;

        if(x>y&&x>z){max=x;}
        if(y>z&&y>x){max=y;}
        if(z>x&&z>y){max=z;}

        if(x<y&&x<z){min=x;}
        if(y<z&&y<x){min=y;}
        if(z<x&&z<y){min=z;}

        if (x<max&&x>min){mid=x;}
        if (y<max&&y>min){mid=y;}
        if (z<max&&z>min){mid=z;}

        System.out.println("MAX "+max);
        System.out.println("MID "+mid);
        System.out.println("MIN "+min);

    }
}
