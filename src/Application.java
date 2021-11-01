public class Application {
    
    public static void main(String[] args) {
        int number = 10;
        double aDouble = 9.5;
        String text = "Hii";
        String blank = " ";
        String moreText = "there";
        System.out.println(text + blank + moreText);
        String hiThere = text + blank + moreText;

        System.out.println("Hi" + " " + "there");
        System.out.println(text);
        System.out.println(number);

        System.out.println(hiThere);
        System.out.println("Mynumber is" + number + " ," + aDouble);
    }
}
