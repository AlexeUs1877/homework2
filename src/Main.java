public class Main {
    public static void main(String[] args) {
int a1 = 0;
int b1 = 6;
int a2 = -4;
int b2 = 2;
boolean no = (a1 < a2 && a2 > b1) || (a2 < a1 && a1 > b2);
if (no) {
    System.out.println("Пересечения нет.");
}
else if (a2 == b1) {
    System.out.println("Единственная точка пересечения равна: " + a2);
}
else if (a1 == b2) {
    System.out.println("Единственная точка пересечения равна: " + a1);
}
boolean line1 = (b1 > a2) && (a2 > a1) && (b2 > b1);
if (line1) {
    System.out.println("В данном случае это отрезок с границами: " + a2 + " и " + b1 + ".");
}
boolean line2 = (b2 > a1) && (a1 > a2) && (b1 > b2);
if (line2) {
    System.out.println("В данном случае это отрезок с границами: " + a1 + " и " + b2 + ".");
}
    }
}