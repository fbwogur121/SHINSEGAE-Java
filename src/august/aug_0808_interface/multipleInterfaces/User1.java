package august.aug_0808_interface.multipleInterfaces;

import java.util.ArrayList;
import java.util.List;

public class User1 {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();

        Searchable searchable = new SmartTelevision();
        searchable.search("https://www.fbwogur121.com");


    }
}
