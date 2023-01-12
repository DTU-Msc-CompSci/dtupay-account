package org.acme;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CustomerService {

    List<User> users = new ArrayList<>();

    public CustomerService() {
//        System.out.println("CustomerService Created");
    }

    public List<User> getCustomers() {
        return users;
    }

    public void addCustomer(User user) {
        users.add(user);
        System.out.println("User added to service");
    }

    // TODO: Start with the CPR Number for search
    public User getCustomer(String bankId) {
        for (User user: users) {
            if (user.bankId.equals(bankId)) {
                return user;
            }
        }
        return null;
    }


    public String generateUniqueId() {
        return UUID.randomUUID().toString();
    }

}