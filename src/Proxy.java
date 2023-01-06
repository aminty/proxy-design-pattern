import java.util.ArrayList;
import java.util.List;

public class Proxy implements Internet {
    Internet internet = new RealInternet();
    static List<String> bannedSite = new ArrayList<>();

    static {
        bannedSite.add("one.com");
        bannedSite.add("two.com");
        bannedSite.add("three.com");
    }

    @Override
    public void connectTo(String hostName) throws Exception {
        if (bannedSite.contains(hostName)) {
            throw new Exception("Access Denied");

        }
        internet.connectTo(hostName);
    }
}
