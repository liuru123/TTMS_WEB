package com.ttms.service;

import com.ttms.entity.Play;
import com.ttms.entity.Ticket;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by hacker on 17-6-1.
 */
public interface TicketService {
    public void insertTicket(Ticket ticket);
//    public void deletePlay(int play_id);
//    public void updatePlay(Play play);
//
//    public Play selectPlayByPlay_id(int play_id);
//    public List<Play> selectPlay();
//    public String addPlay(HttpServletRequest request);
//    public String updatePlay(HttpServletRequest request);
}
