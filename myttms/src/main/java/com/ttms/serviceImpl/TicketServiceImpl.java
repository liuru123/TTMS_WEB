package com.ttms.serviceImpl;

import com.ttms.dao.TicketDAO;
import com.ttms.entity.Ticket;
import com.ttms.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hacker on 17-6-1.
 */
@Service("TicketServiceImpl")
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketDAO ticketDAO;
    @Override
    public void insertTicket(Ticket ticket) {
        ticketDAO.insertTicket(ticket);
    }
}
