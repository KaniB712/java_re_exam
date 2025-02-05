package shape;

abstract class Shape {
    abstract void draw();
    abstract void erase();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    void erase() {
        System.out.println("Erasing Square");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Triangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle();
        shape.draw();
        shape.erase();

        shape = new Triangle();
        shape.draw();
        shape.erase();

        shape = new Square();
        shape.draw();
        shape.erase();
    }
}
