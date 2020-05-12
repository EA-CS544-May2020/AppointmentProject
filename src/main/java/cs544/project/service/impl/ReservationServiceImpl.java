package cs544.project.service.impl;

import org.springframework.stereotype.Service;

import cs544.project.domain.Reservation;
import cs544.project.service.IReservationService;
import cs544.project.service.response.ReservationResponse;
import edu.miu.common.service.BaseReadServiceImpl;

@Service
public class ReservationServiceImpl extends BaseReadServiceImpl<ReservationResponse, Reservation, Integer> implements IReservationService{

}
