abstract class Shape implements Comparable<Shape>{
   abstract public void Draw();
   protected double priority;
   public int compareTo(Shape other){
      return new Integer(priority).compareTo(other.priority);
   }
}

abstract class Circle extends Shape {
   private int radius;
   private Point center;
   public Circle(int radius, Point center) {
       this.priority = 1D;
       this.radius = radius;
       this.center = center;
   }
}

abstract class Square extends Shape {
   private int size;
   private Point topLeft;
   public Square(int size, Point topLeft) {
       this.priority = 2D;
       this.size = size;
       this.topLeft = topLeft;
   }
}

class BigCircle extends Circle {
   public BigCircle(int radius, Point center) {
       super(radius, center);
   }
   public void Draw() {
      //円を描く
   }
}

class BigSquare extends Square {
   public BigSquare(int size, Point topLeft) {
       super(size, topLeft);
   }
   public void Draw() {
      //正方形を描く
   }
}

class DrawingTool {
    public void DrawAllShapes(List<Shape> shapeList) {
        shapeList.stream().sort().forEach(Shape::Draw);
    }
}

class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}