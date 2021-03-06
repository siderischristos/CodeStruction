package com.WebApp.CodeStruction.mappers;

import com.WebApp.CodeStruction.domain.User;
import com.WebApp.CodeStruction.forms.UserCreateForm;
import org.springframework.stereotype.Component;


@Component
public class UserFormToUserMapper {

    public User toUser(UserCreateForm userCreateForm) {
        User user = new User();
        user.setSsn(userCreateForm.getSsn());
        user.setFirstName(userCreateForm.getFirstName());
        user.setLastName(userCreateForm.getLastName());
        user.setAddress(userCreateForm.getAddress());
        user.setPhone(userCreateForm.getPhone());
        user.setEmail(userCreateForm.getEmail());
        user.setUsername(userCreateForm.getUsername());
        user.setPassword(userCreateForm.getPassword());
        user.setRole(userCreateForm.getRole());

        return user;
    }
}
