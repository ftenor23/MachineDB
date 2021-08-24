package com.tenor.machineryApp.presentation;

import com.tenor.machineryApp.domain.Machine;
import com.tenor.machineryApp.domain.MachineRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.crypto.Mac;

@RestController
public class MachineController {
    private MachineRepository machineRepository;

    public MachineController(MachineRepository machineRepository) {
        this.machineRepository = machineRepository;
    }

    @GetMapping("machines/{id}")
    public ResponseEntity<Machine> findById(@PathVariable String id) {
        Machine machine = machineRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Machine not found"));
        return new ResponseEntity<>(machine, HttpStatus.ACCEPTED);
    }

}
