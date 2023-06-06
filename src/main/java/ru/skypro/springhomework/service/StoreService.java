package ru.skypro.springhomework.service;

import ru.skypro.springhomework.service.impl.Cart;

import java.util.List;
import java.util.Set;

public interface StoreService {

    Set<Integer> add(List<Integer> ids);
    Set<Integer> get();

}
