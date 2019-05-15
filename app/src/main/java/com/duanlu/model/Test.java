package com.duanlu.model;

/********************************
 * @name Test
 * @author 段露
 * @createDate 2019/05/15 10:23
 * @updateDate 2019/05/15 10:23
 * @version V1.0.0
 * @describe TODO
 ********************************/
public class Test {

    public static void main(String[] args) {
        Model model1 = new ModelOne();
        Model model2 = new ModelOne();
        Model model3 = new ModelTwo();
        Model model4 = null;
        Model model5 = new ModelOne(2);
        Model model6 = new ModelOne(2);
        Model model7 = new ModelTwo(2);
        Model model8 = new ModelOne(20);
        boolean isEquals = model1.equals(model2);
        System.out.println("是否相等：" + model1.equals(model2) + "--" + model1.equals(model3) + "--" + model1.equals(model4));
        System.out.println("是否相等_：" + model5.equals(model6) + "--" + model5.equals(model1) + "--" + model6.equals(model7) + "--" + model5.equals(model8));
    }

}
