package com.advncex.problem01;

public class Test {
    public static void main(String[] args) {
        // 创建NewPhone对象
        NewPhone newPhone = new NewPhone();

        // 调用set方法赋值
        newPhone.setBrand("华为");
        newPhone.setPrice(8499);

        // 调用get方法获取属性值
        System.out.println("新手机的品牌为："+newPhone.getBrand()+"\n新手机的价格为："+newPhone.getPrice());

        System.out.println("==============");
        // 调用父类中继承过来的方法
        newPhone.call("貂蝉");
        newPhone.message();
        System.out.println("==============");

        // 调用自己的特有方法
        newPhone.game();
    }
}
