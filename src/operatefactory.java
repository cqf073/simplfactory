/**
 * 功能描述
 *
 * @Author：cqf
 * @2020/4/2216:03
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class operatefactory {
    public static operate choseoperate(String operator){
        operate operate=null;
        if("+".equals(operator)) {
            return new operateadd();
        }
        else if ("-".equals(operator)){
            return new operateSub();
        }
        else if ("*".equals(operator)){
            return new operateMul();
        }
        else if ("/".equals(operator)){
            return new operatediv();
        }

           return operate;
    }
}
