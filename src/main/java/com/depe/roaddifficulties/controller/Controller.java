package com.depe.roaddifficulties.controller;

import com.depe.roaddifficulties.model.Results;
import com.depe.roaddifficulties.service.TrafficDifficultiesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/traffic-difficulties")
class Controller {

    private final TrafficDifficultiesService trafficDifficultiesService;

    Controller(TrafficDifficultiesService trafficDifficultiesService) {
        this.trafficDifficultiesService = trafficDifficultiesService;
    }

    @GetMapping()
    ResponseEntity<Results> getResults(){
        return ResponseEntity.ok(trafficDifficultiesService.getResults());
    }

    @GetMapping("/road/{road}")
    ResponseEntity<Results> getResultsByRoad(@PathVariable String road){
        return ResponseEntity.ok(trafficDifficultiesService.getResultsByRoad(road));
    }

    @GetMapping("/voivodeship/{voivodeship}")
    ResponseEntity<Results> getResultsByVoivodeship(@PathVariable String voivodeship){
        return ResponseEntity.ok(trafficDifficultiesService.getResultsByVoivodeship(voivodeship));
    }

    @GetMapping("/map")
    ResponseEntity<Results> getResultsByMap(@RequestParam Double latitude, @RequestParam Double longitude, @RequestParam Double distance){
        return ResponseEntity.ok(trafficDifficultiesService.getResultsByDistance(latitude, longitude, distance));
    }

}
