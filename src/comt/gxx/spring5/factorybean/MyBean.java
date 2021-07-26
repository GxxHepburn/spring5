package comt.gxx.spring5.factorybean;

import comt.gxx.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author gxx
 * @create 2021-07-26 16:47
 */
public class MyBean implements FactoryBean<Course> {
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
