
class Methods{
    String animal;
    int value;

    void run(){
        System.out.println("Running");
        System.out.println("My " + animal + " is " + value + " years old");
    }

    void talk (String text){
        System.out.println(text);
    }
}


class Products {
    String name;
    int stock;
    int price;
    String category;

    void beli(int jumlah, int uang){
        int harga = jumlah * price;
        if(uang < harga){
            System.out.println("Maaf uang anda tidak cukup");
        }else{
            stock = stock - jumlah;
            int kembalian = uang - harga;
            System.out.println("Terimakasih telah membeli " + name + " Seharga " + harga);
            System.out.println("===========================");
            System.out.println("kembalian anda : " + kembalian);
        }
    }
    void stockIn(int jumlah){
        stock = stock + jumlah;
        System.out.println("stock bertambah :" + jumlah + ", total : "+ stock);
    }
    void stockOut(int jumlah){
        stock = stock - jumlah;
        System.out.println("stock berkurang :" + jumlah + ", total : "+ stock);
    }


}
public class Objects {
    public static void main(String[] args) {
        
        Methods name = new Methods();

        name.animal = "Cat";
        name.value = 4;

        name.run();
        name.talk("Ini Firli");


        Products baju = new Products();
        int uang = 300000;
        baju.name = "Sweater";
        baju.stock = 20;
        baju.price = 109000;
        baju.category = "Pakaian";
        System.out.println("stock awal : " + baju.stock);
        baju.beli(2, uang);
        System.out.println("stock akhir : " + baju.stock);
        baju.stockOut(5);

    }
}
