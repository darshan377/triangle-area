public class triangle {

    double area (int a,int b,int c){
        double s = (a+b+c)/2.0;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    void print(double area){
        System.out.println("the area is: "+area);
    }
}
