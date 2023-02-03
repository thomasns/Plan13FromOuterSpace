package io.thomasns.Plan13FromOuterSpace.controllers;

import io.thomasns.Plan13FromOuterSpace.services.SatelliteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class SatelliteController {

        private final SatelliteService satelliteService;

        @Autowired
        public SatelliteController(SatelliteService satelliteService)
        {
            this.satelliteService = satelliteService;
        }


}
