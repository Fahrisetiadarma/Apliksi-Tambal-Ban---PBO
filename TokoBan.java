import java.util.Scanner;

public class TokoBan implements Tambal {
    int id_customer;
    int id_montir;

    final void input_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("============================================");
        System.out.println("               DATA SERVICE                 ");
        System.out.println("============================================");
        System.out.println("Masukan ID Customer       : ");
        id_customer = input.nextInt();
        System.out.println("Masukan ID Montir          : ");
        id_montir = input.nextInt();
    }

    void jenis_service(){

    }
    void update_data(){

    }

    @Override
    public void tambal() {
        System.out.println("Anda memilih tambal ban");
    }

    @Override
    public void ganti() {
        System.out.println("Anda memilih ganti ban");

    }
}