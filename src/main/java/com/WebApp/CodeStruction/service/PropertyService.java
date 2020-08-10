package com.WebApp.CodeStruction.service;


import com.WebApp.CodeStruction.domain.Property;
import com.WebApp.CodeStruction.model.PropertyModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PropertyService {

    List<PropertyModel> findAll();

    Property createProperty (Property property);

    Optional<PropertyModel> findById(Long id);

    Property updateProperty (PropertyModel propertyModel);

    void deleteById(Long id);

    List<PropertyModel> findByPin(String pin);

    List<PropertyModel> findByOwner(String owner);

    List<PropertyModel> findByPinAndOwner(String pin, String owner);

}
