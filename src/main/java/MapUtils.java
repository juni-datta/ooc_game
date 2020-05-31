import com.google.gson.Gson;

import java.io.*;
import java.util.HashMap;

class MapUtils{

    public Map loadMap(File file) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(file));
        String jsonString = br.readLine();
        Gson gson = new Gson();
        HashMap<String, String> hashmap = gson.fromJson(jsonString, HashMap.class);

        return new Map();
    }


    public void saveMap(File file){
    }
}