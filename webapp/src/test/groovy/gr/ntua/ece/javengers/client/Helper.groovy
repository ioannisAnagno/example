package gr.ntua.ece.javengers.client

import gr.ntua.ece.javengers.client.model.Product
import gr.ntua.ece.javengers.client.model.ProductList
import gr.ntua.ece.javengers.client.model.Shop
import gr.ntua.ece.javengers.client.model.ShopList

class Helper {

    static final String HOST  = "localhost"
    static final int PORT     = 8765
    static final String TOKEN = "ABC123"
    static final String USER  = "username"
    static final String PASS  = "passwordss"

    static final Product newProduct(String id, Map productData) {
        Product p = new Product(productData)
        p.id = id
        return p
    }

    static final Shop newShop(String id, Map shopData) {
        Shop s = new Shop(shopData)
        s.id = id
        return s
    }

    //Place the fields in the same order as defined in the respective class
    static final def PROD1_DATA = [
            name        : "FirstProduct",
            description : "FirstDescription",
            category    : "FirstCategory",
            tags        : ["Tags", "of", "first", "Product"],
            withdrawn   : false
    ]

    static final def PROD2_DATA = [
            name        : "SecondProduct",
            description : "SecondDescription",
            category    : "SecondCategory",
            tags        : ["Tags", "of", "second", "Product"],
            withdrawn   : false
    ]

    static final def PROD3_DATA = [
            name        : "ProductName",
            description : "ProductDescription",
            category    : "FirstCategory",
            tags        : ["Tags", "of", "first", "Product"],
            withdrawn   : false
    ]

    static final Product PROD1    = newProduct("1", PROD1_DATA)
    static final Product PROD2    = newProduct("2", PROD2_DATA)
    static final Product PROD1UPD = newProduct("1", PROD3_DATA)

    static final ProductList PRODUCTS = new ProductList(
            start   : 0,
            count   : 10,
            total   : 2,
            products: [PROD1, PROD2]
    )

    //Place the fields in the same order as defined in the respective class
    static final def SHOP1_DATA = [
            name     : "FistShop",
            address  : "AddressOfFirstShop",
            lat      : 37.97864720247794,
            lng      : 23.78350140530576,
            tags     : ["Tags", "of", "first", "shop"],
            withdrawn: false
    ]

    static final def SHOP2_DATA = [
            name     : "SecondShop",
            address  : "AddressOfSecondShop",
            lat      : 37.98136303504576,
            lng      : 23.78413117565094,
            tags     : ["Tags", "of", "second", "shop"],
            withdrawn: false
    ]

    static final def SHOP3_DATA = [
            name     : "OtherShop",
            address  : "OtherAddress",
            lat      : 37.97864720247794,
            lng      : 23.78350140530576,
            tags     : ["Tags", "of", "first", "shop"],
            withdrawn: false
    ]

    static final Shop SHOP1    = newShop("1", SHOP1_DATA)
    static final Shop SHOP2    = newShop("2", SHOP2_DATA)
    static final Shop SHOP1UPD = newShop("1", SHOP3_DATA)

    static final ShopList SHOPS = new ShopList(
            start: 0,
            count: 10,
            total: 2,
            shops: [SHOP1, SHOP2]
    )
}


