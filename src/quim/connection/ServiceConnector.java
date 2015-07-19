package quim.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ServiceConnector {
    private URL url;
    private HttpURLConnection connection;
    private OutputStream output;
    private BufferedReader input;
    
    // Server location
    public static final String URL_BASE = "http://127.0.0.1:8080/ChemistryServices/webresources/";
  
    // Singleton
    private static final ServiceConnector INSTANCE = new ServiceConnector();
    public static ServiceConnector getInstance() {
        return INSTANCE;
    }
    
    /**
     * 
     * @return Verdadero si pudo realizar la conexión falso de lo contrario
     * @throws MalformedURLException
     * @throws IOException 
     */
    public boolean testConnection() throws MalformedURLException, IOException {
        try{
            //Parametros de conexion probando accesar a la BD
            url = new URL(URL_BASE + "elementos/H");
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Accept", "application/xml");

            //Respuesta a la conexion
            int code = connection.getResponseCode();
            if(code == HttpURLConnection.HTTP_OK) {
                //Si la respuesta es HTTP_OK significa que el servidor de aplicaciones es accesible 
                //y que además se tiene acceso a la BD
                return true;
            }
        } 
        catch (ConnectException ce) {
            return false;
        }
        
        return false;
    }
}
