package io.thomasns.Plan13FromOuterSpace.controllers;

import io.thomasns.Plan13FromOuterSpace.services.SatelliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final SatelliteService satelliteService;

    public IndexController(SatelliteService satelliteService) {
        this.satelliteService = satelliteService;

    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("satellites", satelliteService.getSatellites());
        return "index";
    }
}
