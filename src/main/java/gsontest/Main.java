package gsontest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URL;

public class Main {
    public static void main(String[] s) throws IOException {
        URL file = Main.class.getClassLoader().getResource("demo.json");
        System.out.println(file);
        String message = FileUtils.readFileToString(new File(file.getFile()));
        System.out.println(message);
        Gson gson = new GsonBuilder().registerTypeAdapter(Item.class,new ItemDeserializer()).create();
        Widget widget = gson.fromJson(message, Widget.class);
        System.out.println(widget);
    }
}
