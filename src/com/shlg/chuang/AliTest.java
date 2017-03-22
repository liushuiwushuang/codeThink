package com.shlg.chuang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

public class AliTest {
/** 请完成下面这个函数，实现题目要求的功能 **/
 /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    private String process(String input) {
        List<String> orderCodes = Arrays.asList(input.split(","));
        List<Order> orderList = new ArrayList<>();
        
        for (String orderCode: orderCodes) {
            Order order = new Order();
            order.setOrderFirst(orderCode.substring(0, 3));
            order.setOrderSecond(orderCode.substring(3, 5));
            order.setOrderThird(orderCode.substring(5, 8));
            orderList.add(order);
        }
        Collections.sort(orderList);
        StringBuilder stringBuilder = new StringBuilder();
        for (Order order : orderList) {
            stringBuilder.append(order.toString()).append(",");
        }
        String string  = stringBuilder.toString();
        return string.substring(0, string.length() - 1);
    }
    
    private class Order implements Comparable<Order>{  //实现排序接口
        private String orderFirst;
        private String orderSecond;
        private String orderThird;
        
        @Override
        public int compareTo(Order order) {
            int firstCompared = this.orderFirst.compareTo(order.getOrderFirst());
            int secondCompared = this.orderSecond.compareTo(order.getOrderSecond());
            int thirdCompared = this.orderThird.compareTo(order.getOrderThird());
            if (firstCompared != 0) {
                return firstCompared;
            } else if (secondCompared != 0) {
                return secondCompared * -1;
            } else if (thirdCompared != 0) {
                return thirdCompared;
            }
            return 0;
        }
        
        public String getOrderFirst() {
            return orderFirst;
        }

        public void setOrderFirst(String orderFirst) {
            this.orderFirst = orderFirst;
        }

        public String getOrderSecond() {
            return orderSecond;
        }

        public void setOrderSecond(String orderSecond) {
            this.orderSecond = orderSecond;
        }

        public String getOrderThird() {
            return orderThird;
        }

        public void setOrderThird(String orderThird) {
            this.orderThird = orderThird;
        }

        @Override
        public String toString() {
            return this.orderFirst + this.orderSecond + this.orderThird;
        }
        
    }

    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        String res;
//            
//        String _input;
//        try {
//            _input = in.nextLine();
//        } catch (Exception e) {
//            _input = null;
//        }
//  
//        res = new AliTest().process(_input);
//        System.out.println(res);
        String input = "004HI090,004HI091,004HZ091,004KY026,030HY018,007GY010,038QA066,004IE071,036PE075,029FA070,038NY002,024DV074,008VR058,008JK081,034GS085,020JH083,038HM003,035IJ091,027CB088,003PH003,039RE044,020CB082,029JX074,034JT078,012AO079,029BN015,013UK028,024MP012,018UX080,013AY033";
        System.out.println(new AliTest().process(input));
    }

// 示例输入1
// 004HI090,004HI091,004HZ091,004KY026

// 示例输入2
// 004HI090,004HI091,004HZ091,004KY026,030HY018,007GY010,038QA066,004IE071,036PE075,029FA070,038NY002,024DV074,008VR058,008JK081,034GS085,020JH083,038HM003,035IJ091,027CB088,003PH003,039RE044,020CB082,029JX074,034JT078,012AO079,029BN015,013UK028,024MP012,018UX080,013AY033


}