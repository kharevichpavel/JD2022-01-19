package by.it.skorobogatyi.jd02_01.services;

import by.it.skorobogatyi.jd02_01.entity.Customer;
import by.it.skorobogatyi.jd02_01.entity.Good;
import by.it.skorobogatyi.jd02_01.entity.Store;
import by.it.skorobogatyi.jd02_01.utils.Constants;
import by.it.skorobogatyi.jd02_01.utils.PriceListRepo;
import by.it.skorobogatyi.jd02_01.utils.RandomData;
import by.it.skorobogatyi.jd02_01.utils.Sleeper;

import java.math.BigDecimal;
import java.util.Map;

public class PensionerRunner extends CustomerRunner{

    private final Customer customer;
    private final StoreRunner storeRunner;
    private final String storeName;


    public PensionerRunner(Customer customer, StoreRunner storeRunner, Store storeName) {
        super(customer, storeRunner, storeName);
        this.customer = customer;
        this.storeRunner = storeRunner;
        this.storeName = storeName.name;
    }


    @Override
    public Good chooseGood() {
        System.out.println(customer + " started to slowly choose and argue with sellers");

        double timeForGoodChoice = RandomData.getRandomNumber(500, 2000) * Constants.PENSIONER_SLOW;

        Sleeper.sleep(timeForGoodChoice);

        int randomGoodNumber = RandomData.getRandomNumber(PriceListRepo.priceList.size() - 1);
        Map.Entry<String, BigDecimal> goodEntry =
                PriceListRepo
                        .priceList
                        .entrySet()
                        .stream()
                        .toList()
                        .get(randomGoodNumber);

        Good good = new Good(goodEntry.getKey(), goodEntry.getValue());

        System.out.println(customer + " have chosen the good");

        double timeForPuttingGoodInCart = RandomData.getRandomNumber(100, 300) * Constants.PENSIONER_SLOW;
        Sleeper.sleep(timeForPuttingGoodInCart);

        return good;
    }
}
