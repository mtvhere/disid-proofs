package org.springframework.roo.relatedreadonly.web;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;
import org.springframework.roo.relatedreadonly.domain.City;

/**
 * = CitiesItemJsonController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = City.class, type = ControllerType.ITEM)
@RooJSON
public class CitiesItemJsonController {
}
