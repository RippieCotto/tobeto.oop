package org.example;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade oranı";
        Product product1 = new Product();
                         //set value
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");
                        //get
       // System.out.println(product1.name);

        Product product2 = new Product();
        //set value
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        //set value
        product3.setName("KitchenAid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.jpg");

        Product[] products =
                {product1, product2, product3};

        for (Product product :
             products) {
            System.out.println(product.getName());

        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("0522222222");
        individualCustomer.setCustomerNumber("11117708900");
        individualCustomer.getFirstName("Fatıma");
        individualCustomer.getLastName("Ekşioğlu");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Tobeto.com");
        corporateCustomer.setPhone("02161111111");
        corporateCustomer.setTaxNumber("111111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer [] customers = {individualCustomer, corporateCustomer};
    }
}