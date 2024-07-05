public class load {
    public static void main(String[] args) throws Exception
    {
           Class.forName("com.mysql.ci.jdbc.Driver");
           System.out.println("loaded");
    }
}
