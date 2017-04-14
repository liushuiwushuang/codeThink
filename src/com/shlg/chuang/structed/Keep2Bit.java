package com.shlg.chuang.structed;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Keep2Bit {
    
    private static void keep2Bit() {
        // 四舍五入
        double f = 2.555;
        BigDecimal b = new BigDecimal(f);
        System.out.println(b.setScale(2, BigDecimal.ROUND_HALF_UP));
        BigDecimal b2 = new BigDecimal(1.005);
        System.out.println(b2.setScale(2, BigDecimal.ROUND_FLOOR));

        BigDecimal b3 = new BigDecimal(1.015);
        double f1 = b3.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(f1);
        
        // DecimalFormat 四舍五入
        System.out.println(new DecimalFormat("#.00").format(3.005926));
        
        // String四舍五入
        double d = 3.005;
        String result = String.format("%.2f", d);
        System.out.println(result);
        
        // 先乘100
        double a = 8.005;
        int c = (int) (a * 100);
        a = (double) c / 100;
        System.out.println(a);
    }

    public static void main(String[] args) {
        keep2Bit();
    }

}
