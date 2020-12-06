import java.util.Scanner;

public class Choice {
    public String choiceS() {
        System.out.println("输入你想加入的数:");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        return a;
    }
    public int choiceI() {
        System.out.println("输入你选择的数:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;
    }
}
