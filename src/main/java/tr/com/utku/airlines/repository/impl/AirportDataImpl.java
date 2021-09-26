package tr.com.utku.airlines.repository.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tr.com.utku.airlines.model.Airport;
import tr.com.utku.airlines.model.AirportCriteria;
import tr.com.utku.airlines.repository.jpa.AirportEntity;
import tr.com.utku.airlines.repository.jpa.AirportRepository;
import tr.com.utku.airlines.services.data.AirportData;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Repository
public class AirportDataImpl implements AirportData {

    private final AirportRepository airportRepository;

    @Override
    public Airport createAirport(Airport airport) {
        AirportEntity airportEntity = airportRepository.save(AirportEntity.fromModel(airport));
        return airportEntity.toModel();
    }

    @Override
    public Airport getAirportByCode(String code) {
//        airportRepository.f
        List<AirportEntity> airportEntity = airportRepository.findByCode(code);
        return airportEntity.get(0).toModel();
    }

    @Override
    public List<Airport> listAirports(AirportCriteria criteria) {

        List<AirportEntity> airportEntityList = airportRepository.findAirportTest(criteria.getCode(), criteria.getCity());
        return airportEntityList.stream().map(airportEntity -> airportEntity.toModel()).collect(Collectors.toList());
    }
}
