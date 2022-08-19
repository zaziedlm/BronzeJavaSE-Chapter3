package chap3_22;

public class Main {
    public static void main(String[] args) throws Exception {
        String name = "cd";
        switch (name) {
            case "book":
                System.out.print("本");
                break;
            case "game":
                System.out.print("ゲーム");
                break;
            default:
                System.out.print("その他");
        }

    }
}
