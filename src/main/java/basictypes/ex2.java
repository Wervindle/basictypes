package basictypes;

public class ex2 {

    public static void main(String[] args) {
        int r = 25, R = 30, a = 15, b = 19, c = 16, h = 14, sa = 20, sb = 30;
        double w = 2, St, Pt, Pp, Sp, C, Sc, Sr;
        C = 2 * r * Math.PI;
        Sc = (Math.pow(r, w)) * Math.PI;
        Sr = Math.PI * (Math.pow(R, w) - Math.pow(r, w));
        Pt = a + b + c;
        St = (b * h) / 2;
        Pp = sa * 2 + sb * 2;
        Sp = sa * sb;
        System.out.println("Длина окружности = " + C);
        System.out.println("Площадь окружности = " + Sc);
        System.out.println("Площадь кольца = " + Sr);
        System.out.println("Периметр треугольника = " + Pt);
        System.out.println("Площадь треугольника = " + St);
        System.out.println("Периметр прямоугольника = " + Pp);
        System.out.println("Площадь прямоугольника = " + Sp);
    }

}
