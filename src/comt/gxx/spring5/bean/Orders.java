package comt.gxx.spring5.bean;

/**
 * @author gxx
 * @create 2021-07-26 17:18
 */
public class Orders {

    private String oname;

    public Orders() {
        System.out.println("第一步 执行无参数构造创建bean实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二部 调用set方法设置属性值");
    }

    public void initMethod() {
        System.out.println("第三步 执行初始化的方法");
    }

    public void destroyMethod() {
        System.out.println("第五步 执行销毁的方法");
    }
}
