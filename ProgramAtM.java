
package programatm;

import java.util.Scanner;


public class ProgramAtM {

    
    public static void main(String[] args) {
        int menu;
        menu =0;
        int setorTunai =0, tarikTunia=0, saldo = 5000000;
        Scanner a = new Scanner (System.in);
        do
        {
            System.out.println("Menu pilihan :");
            System.out.println("1.Cek Saldo");
            System.out.println("2.Tarik Tunai");
            System.out.println("3.Setor Tunai");
            System.out.println("4. Keluar");
            System.out.println("Pilih Menu :");
            menu = a.nextInt();
            if (menu==1){
                System.out.println("Saldo Anda Adalah : Rp" +saldo);
            }
            else if(menu==2){
                System.out.println("Jumlah Yang Akan Di Tarik : Rp. ");
                int tarikTunai = a.nextInt();
                if (tarikTunai>=saldo){
                    System.out.println("Saldo Anda Tidak Mencukupi: ");
                }
                else{
                    saldo = saldo - tarikTunai;
                    System.out.println("Sisa Saldo Anda Adalah :" +saldo);
                    
                }
            }
            else if(menu==3){
                System.out.println("Jumlah Tunai Yang Di Setor: RP.");
                setorTunai = a.nextInt();
                saldo = saldo + setorTunai;
                System.out.println("Saldo Anda Adalah : Rp." +saldo);
                
            }
        }
        while (menu<4);
    }
}    

