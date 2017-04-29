package com.shlg.chuang.enumclass;

public enum Meals {
    
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);
    
    private Food[] values;
    
    private Meals(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }
    
    public Food randomSelection() {
        return Enums.random(values);
    }
    
    public interface Food {
        
        enum Appetizer implements Food {
            SALAD, SOUP, SPRING_ROLLS;
        }
        
        enum MainCourse implements Food {
            LASAGE, BURRITO, PAD_THAI,
            LENTILS, HUMMOUS, VINDALOO;
        }
        
        enum Dessert implements Food {
            TIRAMISU, GELATO, NLACK_FOREST_CAKE,
            FRUIT, CREME_CARMEL;
        }
        
        enum Coffee implements Food {
            BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
            LATTE, CAPPUCCINO, TEA, HERB_TEA;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (Meals meal : Meals.values()) {
                Food food = meal.randomSelection();
                System.out.println(food);
            }
            System.out.println("----");
        }
    }

}
