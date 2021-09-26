package tr.com.utku.airlines.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.utku.airlines.controller.request.FlightDefinitionRequest;
import tr.com.utku.airlines.controller.request.FlightListRequest;
import tr.com.utku.airlines.controller.response.FlightDefinitionResponse;
import tr.com.utku.airlines.controller.response.FlightListResponse;
import tr.com.utku.airlines.model.Flight;
import tr.com.utku.airlines.services.FlightService;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "flight")
public class FlightController {

    private final FlightService flightService;

    @PostMapping(value = "create-flight")
    public FlightDefinitionResponse createFlight(@RequestBody @Valid FlightDefinitionRequest request) {
        Flight model = flightService.createFlight(request.toModel());
        return FlightDefinitionResponse.fromModel(model);
    }

    @PostMapping(value = "list-flight")
    public FlightListResponse listFlight(@RequestBody FlightListRequest request) {
        List<Flight> flightList = flightService.findFlight(request.toModel());
        return FlightListResponse.fromModel(flightList);
    }

}
