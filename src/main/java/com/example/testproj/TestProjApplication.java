package com.example.testproj;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TestProjApplication {
    //TODO Изменить People на User и сделать пароли с логином, добавить 3 сущности чтобы было 4 связи между ними(User, Book, Library, Chapter тип читалка хотя там больше будет, это на связанность)
    //TODO Задача*(тип доп) Добавить какую нибудь логику на особые действия ну там если магазин то посчитать итоговую стоимость корзины например
    //TODO Поставить базовый Spring Security(хэш пароля и какие страницы можно с авторизацией смотреть и какие нет)
    public static void main(String[] args) {
        SpringApplication.run(TestProjApplication.class, args);
    }

}
