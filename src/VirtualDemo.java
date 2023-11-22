public class VirtualDemo {
    public static void main(String[] args) {

        Gaji s = new Gaji("Wahyu", "KUBAR", 1, 5000.00);
        Pegawai t = new Gaji("Zulfa", "Samarinda", 2, 2500.00);
        Pegawai r = new Pegawai("Ami", "Batusangkar", 3);

        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        s.mailCheck();

        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai --");
        t.mailCheck();

        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai --");
        r.mailCheck();

    }
}
