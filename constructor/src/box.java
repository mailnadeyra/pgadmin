public class box {


    public double width;
    public double height;
    public double depth;

    public box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public box(double width, double height) {
        System.out.println("parameter constructor with overloading");
        this.width = width;
        this.height = height;
        depth = 2;
    }

    box(box s) {
        System.out.println("copy constructor");
        width = s.width;
        height = s.height;
        depth = s.depth;
    }

    box() {
        System.out.println("default constructor");
        width = 10;
        height = 20;
        depth = 12;
    }

    public double volume() {
        return (width * height * depth);
    }
}



