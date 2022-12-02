public class Main {
    public static void main(String[] args) {
        int a1 = 0;
        int b1 = 4;
        int a2 = -2;
        int b2 = 4;
        boolean no = (a1 < a2 && a2 > b1) || (a2 < a1 && a1 > b2);
        if (no) {
            System.out.println("Пересечения нет.");
        } else if (a2 == b1) {
            System.out.println("Единственная точка пересечения равна: " + a2);
        } else if (a1 == b2) {
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
        boolean line3 = (a1 < a2 && a2 < b1) && (b1 > b2 && b2 > a1);
        if (line3) {
            System.out.println("В данном случае этот отрезок находится внутри другого и точки их пересечения равны: " + a2 + " и " + b2 + ".");
        }
        boolean line4 = ((a2 < a1 && a1 < b2) && (b2 > b1 && b1 > a2)) || (a1 == a2 && b2 > b1); //здесь дописал код в boolean
        if (line4) {
            System.out.println("В данном случае этот отрезок находится внутри другого и точки их пересечения равны: " + a1 + " и " + b1 + ".");
        }
        boolean line5 = (a1 == a2 && b1 > b2) || (b1 == b2 && a1 > a2); //здесь дописал тоже код в boolean
        if (line5) {
            System.out.println("В данном случае этот отрезок находится внутри другого и точки их пересечения равны: " + a1 + " и " + b2 + ".");
        }
        boolean line6 = b2 == b1 && a1 < a2;
        if(line6) {
            System.out.println("В данном случае этот отрезок находится внутри другого и точки их пересечения равны: " + a1 + " и " + b2 + ".");
        }
        boolean line7 = a1 == a2 && b1 == b2;
        if (line7) {
            System.out.println("В данном случае эти отрезки совпадают друг с другом и точки их пересечения равны: " + a2 + " и " + b1 + ".");
        }

    }
}