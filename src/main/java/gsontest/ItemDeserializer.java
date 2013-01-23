package gsontest;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class ItemDeserializer implements JsonDeserializer<Item> {

    static Map<String,Class<? extends Display>> classList;

    static {
        classList = new HashMap<String,Class<? extends Display>>();
        classList.put("video",VideoDisplay.class);
        classList.put("3dmodel",ThreeDModelDisplay.class);
    }

    @Override
    public Item deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject object = (JsonObject) json;
        String  type = ((JsonObject) json).get("type").getAsString();
        String  id = ((JsonObject) json).get("id").getAsString();
        JsonElement display = object.get("display");
        Display displayObj = context.deserialize(display,classList.get(type));
        Item item = new Item(id,type);
        item.setDisplay(displayObj);
        return item;
    }
}
