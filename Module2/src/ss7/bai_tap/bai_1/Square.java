package ss7.bai_tap.bai_1;

class Square extends Shape  {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }


    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide();

    }

    @Override
    public void resize(double percent) {
        this.side += percent * this.side/100;
    }
}
