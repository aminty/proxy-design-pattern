public class Main {
    public static void main(String[] args) {
        Internet internet =new Proxy();

        try {
            internet.connectTo("yahoo.com");
            internet.connectTo("one.com");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}