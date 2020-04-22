/**
 * 功能描述
 *
 * @Author：cqf
 * @2020/4/2216:03
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class operateadd extends operate {
    @Override
    public double getresult() {
        double reslut = 0;
        reslut = getA()+getB();
        return  reslut;
    }
}
