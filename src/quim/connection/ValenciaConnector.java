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
import static quim.connection.ServiceConnector.URL_BASE;

public class ValenciaConnector extends ServiceConnector {
    private URL url;
    private HttpURLConnection connection;
    private OutputStream output;
    private BufferedReader input;
    
    /**
     * @param elem El simbolo del elemento a buscar
     * @return Una lista de enteros con las valencias del elemento buscado
     * @throws MalformedURLException
     * @throws IOException 
     */
    public List<Integer> getValuesOf(String elem) throws MalformedURLException, IOException {
        //Parametros de conexion
        url = new URL(URL_BASE + "valencias/values/" + elem);
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Accept", "text/plain");
        
        //Respuesta a la conexion
        int code = connection.getResponseCode();
        if(code == HttpURLConnection.HTTP_OK) {
            // Se obtiene el flujo de entrada para la conexion
            input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String response = input.readLine();
            return parseStringToList(response);
        }
        return null;
    }
    
    // Parsea una cadena con el siguiente formato "[-1, 1, 2, 3]" a una lista con dichos elementos
    private List<Integer> parseStringToList(String list) {
        if(list == null) 
            return null;
        list = list.replaceAll("[ \\[\\]]", "");
        String [] separated = list.split(",");
        
        if(separated.length == 0) 
            return null;
        
        List<Integer> nums = new ArrayList<>();
        for(String val : separated) {
            if(val != null && !val.equals("null"))
                nums.add(Integer.parseInt(val));
        }
        return nums;
    }
    
    // Singleton
    private static final ValenciaConnector INSTANCE = new ValenciaConnector();
    public static ValenciaConnector getInstance() {
        return INSTANCE;
    }
    
//    public static void main(String args[]) throws IOException {
//        ValenciaConnector connector = ValenciaConnector.getInstance();
//        List<Integer> valuesOx = connector.getValuesOf("O");
//        System.out.println(valuesOx);
//    }
}
