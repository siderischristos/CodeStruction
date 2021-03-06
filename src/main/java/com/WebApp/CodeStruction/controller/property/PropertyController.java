package com.WebApp.CodeStruction.controller.property;


import com.WebApp.CodeStruction.model.PropertyModel;
import com.WebApp.CodeStruction.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PropertyController {

    private static final String PROPERTY_LIST = "properties";

    @Autowired
    private PropertyService propertyService;


    @GetMapping(value = "/admin/properties")
    public String properties(Model model) {
        List<PropertyModel> properties = propertyService.findAll();
        model.addAttribute(PROPERTY_LIST, properties);
        return "pages/properties_show";
    }
}
