package comt.gxx.spring5.collectiontype;

import java.util.List;

/**
 * @author gxx
 * @create 2021-07-26 15:58
 */
public class Book {

    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test() {
        System.out.println(list);
    }
}
