public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public Punto(){

    }

    public double getX() {
        return this.x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void desplazarX(double x) {
        this.x += x;
    }

    public void desplazarY(double y) {
        this.y += y;
    }

    public void desplazarPunto(double x, double y) {
        this.desplazarX(x);
        this.desplazarY(y);
    }

    public Punto sumarPunto(Punto p) {
        Punto suma = new Punto();
        suma.setX(this.getX() + p.getX());
        suma.setY(this.getY() + p.getY());

        return suma;
    }

    @Override
    public String toString() {
        return "( " + this.x + ", " + this.y + " )";
    }
}
