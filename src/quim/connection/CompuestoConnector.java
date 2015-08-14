package quim.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import static quim.connection.ServiceConnector.URL_BASE;

public class CompuestoConnector extends ServiceConnector {
    private URL url;
    private HttpURLConnection connection;
    private OutputStream output;
    private BufferedReader input;
    
    public String getCompuestoName(String compuesto, int type) throws MalformedURLException, IOException {
        //Parametros de conexion
        url = new URL(URL_BASE + "compuestos/" + type + "/" + compuesto);
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Accept", "text/plain");
        
        //Respuesta a la conexion
        int code = connection.getResponseCode();
        if(code == HttpURLConnection.HTTP_OK) {
            // Se obtiene el flujo de entrada para la conexion
            input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            return input.readLine();            
        }
        return "";
    }
    
    // Singleton
    private static final CompuestoConnector INSTANCE = new CompuestoConnector();
    public static CompuestoConnector getInstance() {
        return INSTANCE;
    }
}
