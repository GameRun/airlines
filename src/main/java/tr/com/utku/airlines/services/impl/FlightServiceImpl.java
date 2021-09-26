package tr.com.utku.airlines.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.utku.airlines.model.FlightCriteria;
import tr.com.utku.airlines.model.Flight;
import tr.com.utku.airlines.services.data.FlightData;
import tr.com.utku.airlines.services.FlightService;
import tr.com.utku.airlines.services.exception.AirlinesBusinessException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FlightServiceImpl implements FlightService {

    private final FlightData flightData;

    @Override
    public Flight createFlight(Flight model) {

        if (model.getDeparture().equals(model.getDestination())) {
            throw new AirlinesBusinessException("A10003");
        }

        if (model.getFlightTime().isBefore(LocalTime.now())) {
            throw new AirlinesBusinessException("A10004");
        }

        if (model.getFlightDate().isBefore(LocalDate.now())) {
            throw new AirlinesBusinessException("A10006");
        }

        Flight existModel = flightData.getFlight(model.getFlightCode());
        if (existModel != null) {
            return flightData.createFlight(model);
        } else {
            throw new AirlinesBusinessException("A10005");
        }
    }

    @Override
    public List<Flight> findFlight(FlightCriteria criteria) {
        return flightData.findFlight(criteria);
    }

}