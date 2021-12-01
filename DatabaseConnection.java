public class DatabaseConnection{
    private static DatabaseConnection createOnce;
    private DatabaseConnection(){
        System.out.println("Connected");
    }

    public static DatabaseConnection getConnectionObject(){
        return new DatabaseConnection();
    }

    public static DatabaseConnection _getConnectionObject(){
        if(createOnce==null){
            createOnce = new DatabaseConnection();
        }
        else{
            System.out.println("Connection is already established");
        }
        return createOnce;
    }
}