
package if1.pkg10118042.latihan36.targetsaldotabungan;
/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk menampilkan target menabung
 * 
 */
public class IF110118042Latihan36TargetSaldoTabungan {

    
    public static void main(String[] args) {
        targetTabungan tabung = new targetTabungan();
        tabung.saldo = 3500000;
        tabung.bunga = 8;
        int saldoTarget = 6000000;
        
        tabung.targetBulanan(tabung.saldo, saldoTarget);
    }

}
