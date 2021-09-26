package tr.com.utku.airlines.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tr.com.utku.airlines.controller.request.TicketRequest;
import tr.com.utku.airlines.controller.response.TicketResponse;
import tr.com.utku.airlines.model.Ticket;
import tr.com.utku.airlines.services.TickerService;

import javax.validation.Valid;

@RequiredArgsConstructor
@RequestMapping(value = "ticket")
@RestController
public class TicketController {

    private final TickerService ticketService;

    @PostMapping(value = "buy")
    @ResponseStatus(HttpStatus.OK)
    public TicketResponse buyTicket(@Valid @RequestBody TicketRequest request) {
        Ticket model = ticketService.buyTicket(request.toModel());
        return TicketResponse.fromModel(model);
    }
}
