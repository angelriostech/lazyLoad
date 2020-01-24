package co.com.tns.lazy.load.business;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LazyLoadTest {

    private LazyLoad lazyLoad = new LazyLoad();

    @Test
    public void youMustSeparateAList() {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(4);
        list.add(30);
        list.add(29);
        list.add(12);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(5);
        list.add(45);
        list.add(46);
        list.add(47);
        list.add(48);
        list.add(49);
        List<Integer> object = new ArrayList<>();
        object.add(30);
        object.add(29);
        object.add(12);
        object.add(1);
        List<Integer> resultado = lazyLoad.separateList(list);

        Assert.assertEquals(object, resultado);
    }
}
