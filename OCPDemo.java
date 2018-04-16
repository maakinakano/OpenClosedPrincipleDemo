abstract class Shape implements Comparable<Shape>{
   abstract public void Draw();
   public int compareTo(Shape other){
       int thisPriority = Util.priority.get(this.getClass().getName());
       int otherPriority = Util.priority.get(other.getClass().getName());
      return new Integer(thisPriority).compareTo(otherPriority);
   }
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
   public Square(int size, Point topLeft) {
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

class Util {
    public final Map<String, Integer> priority;
    static{
        priority = new HashMap<>();
        priority.put(Circle.getClass.getName(), 1);
        priority.put(Square.getClass.getName(), 2);
    }
}