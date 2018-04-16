abstract class Shape {
   abstract public void Draw();
}

abstract class Circle extends Shape {
   private int radius;
   private Point center;
   public Circle(int radius, Point center) {
      this.radius = radius;
      this.center = center;
   }
}

abstract class Square extends Shape {
   private int size;
   private Point topLeft;
   public Circle(int size, Point topLeft) {
      this.size = size;
      this.topLeft = topLeft;
   }
}

class BigCircle extends Circle {
   public void Draw() {
      //円を描く
   }
}

class BigSquare extends Square {
   public void Draw() {
      //正方形を描く
   }
}

class DrowingTool {
    public void DrawAllShapes(List<Shape> shapeList) {
        shapeList.forEach(Shape::Draw);
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