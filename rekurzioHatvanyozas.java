public class rekurzioHatvanyozas {
    public static void main(String[] args) {
        int szam = 2;
        int kitevo = 5;
        int eredmeny = hatvany(szam, kitevo);
        System.out.println("A " + szam + " " + kitevo + ". hatványa = " + eredmeny);
    }

    public static int hatvany(int alap, int kitevo) {
        if (kitevo == 0) {
            return 1;
        } else {
            return alap * hatvany(alap, kitevo - 1);
        }
    }
}