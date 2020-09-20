class Circle {

    double radius;

    // write methods here
    double getLength() {
        return (double) 2 * Math.PI * radius;
    }

    double getArea() {
        return (double) Math.PI * Math.pow(radius, 2);
    }
}