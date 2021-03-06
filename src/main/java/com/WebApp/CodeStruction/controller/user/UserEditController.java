package com.WebApp.CodeStruction.controller.user;


import com.WebApp.CodeStruction.forms.UserEditForm;
import com.WebApp.CodeStruction.model.UserModel;
import com.WebApp.CodeStruction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import static com.WebApp.CodeStruction.utils.GlobalAttributes.ALERT_MESSAGE;
import static com.WebApp.CodeStruction.utils.GlobalAttributes.ALERT_TYPE;

@Controller
public class UserEditController {

    private static final String USER_FORM = "userEditForm";
    private static final String USER = "user";

    @Autowired
    private UserService userService;


    @PostMapping(value = "/admin/users/{id}/delete")
    public String deleteUser(@PathVariable Long id, RedirectAttributes redirectAttrs) {
        userService.deleteById(id);
        redirectAttrs.addFlashAttribute(ALERT_TYPE, "info");
        redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "User Deleted successfully!");
        return "redirect:/admin/users";
    }

    @PostMapping(value = "/admin/users/{id}/edit")
    public String editUser(@PathVariable Long id, Model model) {
        UserModel userModel = userService.findById(id).get();
        model.addAttribute(USER_FORM, new UserEditForm());
        model.addAttribute(USER, userModel);
        return "pages/user_edit";
    }

    @PostMapping(value = "/admin/users/edit")
    public String editUser(UserModel userModel, RedirectAttributes redirectAttrs) {
        userService.updateUser(userModel);
        redirectAttrs.addFlashAttribute(ALERT_TYPE, "success");
        redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "User Updated successfully!");

        return "redirect:/admin/users";
    }

}
