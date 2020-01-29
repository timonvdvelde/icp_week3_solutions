/*
 * coordinates of points on circle 
 * x = r * cos(alpha)
 * y = r * sin(alpha)
 *
 * law of cosines
 * A, B, C interior angles of the triangle
 * a, b, c, lengths of the sides of triangle opposing angle A, B, C
 * cos(C) = (a*a + b*b - c*c) / (2*a*b)
 * cos(A) = (b*b + c*c - a*a) / (2*b*c)
 * cos(B) = (c*c + a*a - b*b) / (2*c*a)
 *
 * */


class Main {
  public static void main(String[] args) {
    double angle1, angle2, angle3;
    double x1, y1, x2, y2, x3, y3;
    double side1, side2, side3;
    double intAngle1, intAngle2, intAngle3; 
    double radius;
    double sumAngles;

    radius = 1;

    // generate random angles between 0 and 2 pi
    angle1 = Math.random() * 2 * Math.PI;
    angle2 = Math.random() * 2 * Math.PI;
    angle3 = Math.random() * 2 * Math.PI;

    // find coordinates of points on circle.
    x1 = radius * Math.cos(angle1);
    y1 = radius * Math.sin(angle1);

    x2 = radius * Math.cos(angle2);
    y2 = radius * Math.sin(angle2);

    x3 = radius * Math.cos(angle3);
    y3 = radius * Math.sin(angle3);

    // Calculate lengths of sides
    side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
    side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

    // Using trigonometry, calculate interior angles.
    intAngle3 = Math.acos((side1 * side1 + side2 * side2 - side3 * side3) / (2 * side1 * side2));
    intAngle1 = Math.acos((side2 * side2 + side3 * side3 - side1 * side1) / (2 * side2 * side3));
    intAngle2 = Math.acos((side3 * side3 + side1 * side1 - side2 * side2) / (2 * side3 * side1));

    // Show sum of interior angles.
    sumAngles = (intAngle1 + intAngle2 + intAngle3) / Math.PI * 180;
    System.out.println("Interior angles add up to " + sumAngles);
  }
}

