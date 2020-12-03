package edu.nf.demo1;

/**
 * @author wangl
 * @date 2020/11/18
 * Target（目标对象，也就是被代理的对象）
 */
public class AcerFactory implements PcFactory{

    @Override
    public void sell(int money) {
        System.out.println("Acer厂商直销价格：" + money);
    }
}
