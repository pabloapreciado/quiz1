public class Coordenada
{ 

 private double x;
   

    private double y;
    
   

    public Coordenada()
    {

    }

    public Coordenada(double x,double y)
    {
        this.x=x;
        this.y=y;

    }

     public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    } 
    
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString()
    {
        return y + "//" + x;
    }

    public  boolean equals(Object o)
    {
        Coordenada otra=(Coordenada)o;
        return(this.y==otra.y) && (x==otra.x);
    }

    //public double Distancia(Object d)
    //{
    //   Coordenada a = c2-c1;
    //   Coordenada b = c2-c1;
    //   return(this.c1,this.c2) == Math.sqrt();
    //    Distancia(c1, c2)= Math.sqrt(a*a + b*b);

    } 

