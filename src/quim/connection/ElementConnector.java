package quim.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import quim.entities.Elemento;

public class ElementConnector extends ServiceConnector {
    private URL url;
    private HttpURLConnection connection;
    private OutputStream output;
    private BufferedReader input;
    
    /**
     * @param type El tipo de elemento que se esta buscando
     * @return Una lista con todos los elementos que concuerden al tipo especificado
     * @throws MalformedURLException
     * @throws IOException 
     */
    public List<Elemento> getElementsByType(String type) throws MalformedURLException, IOException {
        //Parametros de conexion
        url = new URL(URL_BASE + "elementos/find/" + type);
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Accept", "application/json");
        List<Elemento> elements = new ArrayList<>();
        
        //Respuesta a la conexion
        int code = connection.getResponseCode();
        if(code == HttpURLConnection.HTTP_OK) {
            // Se obtiene el flujo de entrada para la conexion
            input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String response = input.readLine();
            // Parseo de la respuesta a formato JSON
            JSONArray jsonElements = (JSONArray) JSONValue.parse(response);
            // Se almacenan todos los objetos en una lista
            jsonElements.stream().map((obj) -> new Elemento((JSONObject) obj)).forEach((element) -> {
                elements.add((Elemento) element);
            });
        }
        return elements;
    }
    
    /**
     * @param elem El simbolo del elemento que se esta buscando
     * @return Una representacion entidad del elemento 
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Elemento getElement(String elem) throws MalformedURLException, IOException {
        //Parametros de conexion
        url = new URL(URL_BASE + "elementos/" + elem);
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Accept", "application/json");
        
        //Respuesta a la conexion
        int code = connection.getResponseCode();
        if(code == HttpURLConnection.HTTP_OK) {
            // Se obtiene el flujo de entrada para la conexion
            input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String response = input.readLine();
            // Parseo de la respuesta a formato JSON
            JSONObject jsonElement = (JSONObject) JSONValue.parse(response);
            return new Elemento(jsonElement);
        }
        return null;
    }
    
    // Singleton
    private static final ElementConnector INSTANCE = new ElementConnector();
    public static ElementConnector getInstance() {
        return INSTANCE;
    }
    
    
//    public static void main (String args[]) throws IOException {
//        ElementConnector connec = ElementConnector.getInstance();
//        System.out.println(connec.getElementsByType("gas-noble"));
//    }
    
}
