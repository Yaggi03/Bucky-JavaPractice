import java.util.Scanner;

class apples {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        Tuna TunaObject = new Tuna();
        System.out.println("Enter name of first gf here: ");
        String temp = input.nextLine();
        TunaObject.setName(temp);
        TunaObject.saying();
    }
}