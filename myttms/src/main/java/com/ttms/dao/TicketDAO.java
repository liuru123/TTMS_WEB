package com.ttms.dao;

import com.ttms.entity.Schedule;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.ttms.entity.Ticket;

import java.util.List;

/**
 * Created by hacker on 17-6-1.
 */
@Repository("TicketDAO")
public interface TicketDAO {
    public void insertTicket(Ticket ticket);
    public void deleteTicket(int ticket_id);
    public void updateTicket(Ticket ticket);

    public Schedule selectTicketByTicket_id(int ticket_id);
    public List<Schedule> selectTicketeBySeat_id(int Seat_id);

    public List<Schedule> selectTicketByTicket_price(double ticket_price);
    public List<Schedule> selectTicketByTicket_status(int ticket_status);
    public List<Schedule> selectTicketByTicket_locked_time(String ticket_locked_time);

}


