package oct.ex_14102024_Abstraction;

public class CHROMETC extends BaseClass{
    @Override
    void openBrowser(String browser) {
        System.out.println("Open the Chrome");
    }

    @Override
    void closeBrowser(String browser) {
        System.out.println("Close the Chrome");

    }
}
