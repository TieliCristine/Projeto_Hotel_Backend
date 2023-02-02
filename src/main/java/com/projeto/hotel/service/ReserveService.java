package com.projeto.hotel.service;

import com.projeto.hotel.model.entity.*;
import com.projeto.hotel.model.repository.CustomerRepository;
import com.projeto.hotel.model.repository.EmployeeRepository;
import com.projeto.hotel.model.repository.ReserveRepository;
import com.projeto.hotel.model.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ReserveService {

    @Autowired
    private ReserveRepository reserveRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private RoomRepository roomRepository;

    public Reserve save(Reserve reserveForm) {
    Optional<Customer> customer = customerRepository.findById(reserveForm.getCustomer().getId());
    Optional<Employee> employee = employeeRepository.findById(reserveForm.getEmployee().getId());
    Optional<Room> room = roomRepository.findById(reserveForm.getRoom().getId());
    if (customer.isPresent() && employee.isPresent() && room.isPresent()){
        Reserve reserve = reserveRepository.save(reserveForm);
    }
        return reserveRepository.save(reserveForm);
    }

    public List<Reserve> list() {
        return reserveRepository.findAll();
    }

    public Reserve update(Reserve reserve) {
        Reserve existingReserve = reserveRepository.findById(reserve.getId()).orElse(null);
        existingReserve.setQtdPeople(reserve.getQtdPeople());
        existingReserve.setCheckin(reserve.getCheckin());
        existingReserve.setCheckout(reserve.getCheckout());
        existingReserve.setStatus(reserve.getStatus());
        existingReserve.setPrice(reserve.getPrice());
        existingReserve.setCustomer(reserve.getCustomer());
        existingReserve.setEmployee(reserve.getEmployee());
        existingReserve.setRoom(reserve.getRoom());
        return reserveRepository.save(existingReserve);
    }

    public String delete(Long id) {
        reserveRepository.deleteById(id);
        return "Reserva excluída com sucesso!" + id;
    }

    public Reserve findByStatus(StatusReserve statusReserve) {
        return reserveRepository.findByStatus(statusReserve);
    }
}
