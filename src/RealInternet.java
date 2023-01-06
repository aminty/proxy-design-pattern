public class RealInternet implements Internet{
    @Override
    public void connectTo(String hostName) {
        System.out.println("Connecting to "+ hostName);
    }
}
