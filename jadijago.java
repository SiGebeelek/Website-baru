import java.util.Scanner;

public class jadijago {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the number of books purchased: ");
        int book = scanner.nextInt();

        System.out.print("enter the number of pencil purchased: ");
        int pencil = scanner.nextInt();

        //harga satuan buku dan pencil
        double bookPrice = 5000.00;
        double pencilPrice = 2000.00;

        double totalPriceBeforeTax = (book * bookPrice) + (pencil * pencilPrice);

        //tampilkan harga sebelum tax
        System.out.printf("Additional Total price before tax: $%.2f%n" , totalPriceBeforeTax);

        //hitung pajak 10%
        double tax = totalPriceBeforeTax * 0.10 ;

        double totalPriceAfterTax = totalPriceBeforeTax + tax ;

        System.out.printf("Additional total price after adding 10% tax: $%.2f%n" , totalPriceAfterTax);

        //input uang tunai dari pelanggan
        System.out.printf("enter the customer's cash money: ");
        int duit = scanner.nextInt();

        double kembalian = duit - totalPriceAfterTax;

        System.out.printf("The Customer's Money Change : $%.2f%n" ,  kembalian);


        scanner.close();
    }
}
