package Ex5;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Exception;

public class GenericsMap<KeyT extends String, ValueT extends Number>{
    public HashMap<KeyT, ValueT> map = new HashMap<>();

    public GenericsMap<KeyT, ValueT> add(KeyT key, ValueT value){
        this.map.put(key, value);
        return this;
    }

    public ValueT retrieve(KeyT key) throws Exception {
        if (!map.containsKey(key)){
            throw new Exception("Key not found");
        }

        return map.get(key);
    }

    public <H> H get_from_array(ArrayList<H> array, int index){
        return array.get(index);
    }
}
