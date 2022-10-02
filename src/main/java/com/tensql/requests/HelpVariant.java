package com.tensql.requests;

public class HelpVariant extends CommandVariant {

    public HelpVariant() {
        super.name = "help";
    }

    @Override
    public void execute() {
        System.out.println("1. Имена покупателей, кто купил icar и сколько. \n" +
                "2. Какие товары, в каком количестве и кто купили 6 июня 2022 года? Отсортировать по количеству. \n" +
                "3. Вывести имя, цену и количество 5-ти самых продаваемых товаров. \n" +
                "4. Вывести имена и почту людей, кто покупал любой iphone. Отсортировать от я до а. \n" +
                "5. Вывести имена людей, их покупки и дату, которые купили по два продукта. Отфильтровать по дате. \n" +
                "6. Вывести имена, почту людей и продукт, которые закупились больше чем на 5000 \n" +
                "7. Вывести среднюю стоимость корзины (медианную стоимость корзины) \n" +
                "8. Количество пользователей у которых есть хотябы одна покупка (без джоинов) \n" +
                "9. Вывести таблицу где будет 8 колонок: первая это название продукта, остальные семь сколько их было " +
                "куплено в каждый день недели. \n" +
                "10. Вывести продукты в порядке по убыванию принесённой прибыли за последний год.  ");
    }
}
