package Generics;

import java.util.ArrayList;
import java.util.List;

class Container<T extends Number>{
    List<T> list=new ArrayList<>();
    T value;

    public void setValue(T value){
        this.value=value;
    }
    public T getValue(){
        return this.value;
    }

    public void demo(ArrayList<? super T> obj){

    }

}

public class GenericsDemo {
    public static void main(String []args){
        Container<Double> cont=new Container();

        cont.list.add(1.1);
      // cont.list.add("neha");

        System.out.println(cont.list);
        cont.demo(new ArrayList<Number>());

    }
}
