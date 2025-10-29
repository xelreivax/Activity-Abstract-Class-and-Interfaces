package Shape_Area_Calculator;

class Rectangle extends Shape {
    double width, height;

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double calculateArea() {
        return width * height;
    }
}