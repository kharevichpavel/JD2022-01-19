package by.it.tarend.jd02_01.entity;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public static final List<Good> goodsInCart = new ArrayList<>();

    public static void putGoodIntoCart(Good good) {
        goodsInCart.add(good);
    }
}
