package august.aug_0813_generic.generic;

import java.util.ArrayList;
import java.util.List;

public class BoxModel<T> {
    public T content;
    List<T> box = new ArrayList<>();
}
