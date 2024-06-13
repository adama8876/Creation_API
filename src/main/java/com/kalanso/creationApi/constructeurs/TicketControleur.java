package com.kalanso.creationApi.constructeurs;

import com.kalanso.creationApi.modele.Ticket;
import com.kalanso.creationApi.services.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ticket")
@AllArgsConstructor
public class TicketControleur {
    private final TicketService ticketService;

    @PostMapping("/creer")
    public Ticket creer(@RequestBody Ticket T){
        return ticketService.createTicket(T);
    }
}
