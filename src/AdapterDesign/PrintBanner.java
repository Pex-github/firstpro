package AdapterDesign;

public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printStrong() {
        showWithAster();
    }

    @Override
    public void printWeak() {
        showWithParen();
    }
}
