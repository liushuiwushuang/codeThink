package com.shlg.chuang.enumclass;

public class UpcastEnum {

    public static void main(String[] args) {
        Search[] vals = Search.values();
        Enum<?> e = Search.HITHER;
//        e.values()
        for (Enum<?> en : e.getClass().getEnumConstants())
            System.out.println(en);
    }

}

enum Search {
    HITHER,
    YON
}
