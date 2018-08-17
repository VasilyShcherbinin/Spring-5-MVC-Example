package com.geekcap.javaworld.spring5mvcexample.repository;

import com.geekcap.javaworld.spring5mvcexample.model.Widget;
import org.springframework.data.repository.CrudRepository;

public interface WidgetRepository extends CrudRepository<Widget, Long> {

}
