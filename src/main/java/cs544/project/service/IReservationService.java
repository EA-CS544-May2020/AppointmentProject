package cs544.project.service;

import cs544.project.domain.Reservation;
import cs544.project.service.response.ReservationResponse;
import edu.miu.common.service.BaseReadService;

public interface IReservationService extends BaseReadService<ReservationResponse, Reservation, Integer>{

}
