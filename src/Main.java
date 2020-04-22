import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 功能描述
 *
 * @Author：cqf
 * @2020/4/2216:03
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReade = new BufferedReader(new InputStreamReader(System.in));
        try {
            //获取用户数据
            System.out.println("输入数字A");
            Double numberA = Double.parseDouble(bufferedReade.readLine());
            System.out.println("输入操作符 如 + - * / ");
            String operator = bufferedReade.readLine();
            System.out.println("输入数字C");
            Double numberB = Double.parseDouble(bufferedReade.readLine());
            //返回对象相等
            operate oper = operatefactory.choseoperate(operator);
            oper.setA(numberA);
            oper.setB(numberB);
            System.out.println("结果是" + oper.getresult());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
 }
