package Quoters;

public class TerminatorQuoter implements Quoter {
    private String message;
    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("SAY QUOTE !");
        }
    }
}
