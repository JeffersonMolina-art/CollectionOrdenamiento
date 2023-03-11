package gt.edu.umg.progra3.parcial1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StaticStructureManager<T extends Comparable <T>> {

    T[] values ;

    public StaticStructureManager(T[] values) {
        this.values = values;
    }

    public T[] ordenar(){
        //inserte codigo aqui

        Arrays.sort(values);
        return values;
    }

    public T[] ordenarInversa(){
        //inserte codigo aquiS
        Arrays.sort(values, Collections.reverseOrder());
        return values;
    }

}
