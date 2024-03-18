/*
In Java, abstraction is the process of hiding the implementation details of an object and showing only the necessary information to the user. Abstraction can be achieved in Java in two ways:

Abstract classes
Interfaces
Let's take a look at both of these ways in detail.

Abstract Classes
An abstract class is a class that cannot be instantiated, but can be subclassed. Abstract classes can have both abstract and concrete methods. Abstract methods are methods without a body, and they are meant to be overridden by the subclasses.

Here's an example Java program that demonstrates how to implement abstraction using an abstract class:
*/

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rectangle.area());

        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.area());
    }
}

