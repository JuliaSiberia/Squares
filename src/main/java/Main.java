import ru.netology.sqr.NumberOfSquares.services.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();
        int l = 200;
        int u = 300;
        int x = service.squaring(l, u);
        System.out.println(x);
    }
}
