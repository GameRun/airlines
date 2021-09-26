package tr.com.utku.airlines.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tr.com.utku.airlines.controller.request.AirportDefinitionRequest;
import tr.com.utku.airlines.controller.request.AirportListRequest;
import tr.com.utku.airlines.controller.response.AirportDefinitionResponse;
import tr.com.utku.airlines.controller.response.AirportListResponse;
import tr.com.utku.airlines.model.Airport;
import tr.com.utku.airlines.services.AirportServices;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "airport")
public class AirportController {

    public final AirportServices airportServices;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("create-airport")
    public AirportDefinitionResponse createAirport(@RequestBody @Valid AirportDefinitionRequest request) {
        AirportDefinitionResponse response = new AirportDefinitionResponse();
        Airport airport = airportServices.createAirport(request.toModel());
        return response.fromModel(airport);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("list-airport")
    public AirportListResponse listAirports(@RequestBody AirportListRequest request) {
        AirportListResponse airportListResponse = new AirportListResponse();
        List<Airport> airportList = airportServices.listAirport(request.toModel());
        return airportListResponse.fromModel(airportList);
    }


}
