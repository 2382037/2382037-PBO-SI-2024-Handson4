public class ContohParameterMethod {
    // Method dengan satu parameter
    public static int kaliDua(int angka) {
        int hasil = angka * 2;
        return hasil;

    }

    // Method dengan bebarapa parameter
    public static double hitungLuasSegitga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;

    }

    public static void main(String[] args) {
        int hasilKaliDua = kaliDua(5);
        System.out.println("5 x 2 = " + hasilKaliDua);

        double luasSegitiga = hitungLuasSegitga(4, 6);
        System.out.println("Luas segitiga: " + luasSegitiga);
    }
}