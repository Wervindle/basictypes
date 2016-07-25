package basictypes;

public class ex3 {

    public static void main(String[] args) {
        int r = 5, R = 8, a = 15, b = 19, c = 16, H = 25;
        double w = 2, v = 4, Vc, Vpc, Sc, Vb, Sb, Vpp, Spp, Vt, St;
        Vc = Math.PI * Math.pow(r, w) * H;
        Vpc = Math.PI * H * (Math.pow(R, w) - Math.pow(r, w));
        Sc = w * Math.PI * H + w * Math.PI * Math.pow(r, w);
        Vb = v * Math.PI * Math.pow(r, v);
        Sb = v * Math.PI * Math.pow(r, w);
        Vpp = a * b * c;
        Spp = w * (a * b + b * c + a * c);
//      Формулы для тетраэдра взяты с http://profmeter.com.ua/communication/learning/course/course7/lesson264/
        Vt = Math.pow(a, 3) * Math.sqrt(w) / 12;
        St = Math.pow(a, w) * Math.sqrt(3);
        System.out.println("Объём цилиндра = " + Vc);
        System.out.println("Объём полого цилиндра = " + Vpc);
        System.out.println("Объём боковой поверхности цилиндра (не полого) = " + Sc);
        System.out.println("Объём шара = " + Vb);
        System.out.println("Площадь поверхности шара = " + Sb);
        System.out.println("Объём прямоугольного параллелепипеда = " + Vpp);
        System.out.println("Площадь поверхности прямоугольного параллелепипеда = " + Spp);
        System.out.println("Объём тетраэдра = " + Vt);
        System.out.println("Площадь поверхности тетраэдра = " + St);
    }
}
