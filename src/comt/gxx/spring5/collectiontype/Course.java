package comt.gxx.spring5.collectiontype;

/**
 * @author gxx
 * @create 2021-07-26 15:53
 */
public class Course {

    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
