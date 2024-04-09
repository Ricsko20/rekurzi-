public class rekurzioHanoi {
    public static void main(String[] args) {
        int korongokSzama = 3; 
        char forras = 'A';
        char cel = 'C';
        char koztes = 'B';

        hanoi(korongokSzama, forras, cel, koztes);
    }

    public static void hanoi(int n, char forras, char cel, char koztes) {
        if (n == 1) {
            System.out.println("Korong 1 áthelyezése " + forras + " rúdról " + cel + " rúdra");
        } else {
            hanoi(n - 1, forras, koztes, cel);
            System.out.println("Korong " + n + " áthelyezése " + forras + " rúdról " + cel + " rúdra");
            hanoi(n - 1, koztes, cel, forras);
        }
    }
}
