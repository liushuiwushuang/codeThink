package com.shlg.chuang.enumclass;

import com.shlg.chuang.enumclass.Food.Appetizer;
import com.shlg.chuang.enumclass.Food.Coffee;
import com.shlg.chuang.enumclass.Food.Dessert;
import com.shlg.chuang.enumclass.Food.MainCourse;

public class TypeOfFood {

    public static void main(String[] args) {
        Food food = Appetizer.SALAD;
        food = MainCourse.LASAGNE;
        food = Dessert.GELATO;
        food = Coffee.CAPPUCCINO;
    }

}
