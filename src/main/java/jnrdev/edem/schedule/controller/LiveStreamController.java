package jnrdev.edem.schedule.controller;

import jnrdev.edem.schedule.model.LiveStream;
import jnrdev.edem.schedule.repository.LiveStreamRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stream")

public class LiveStreamController {
    private final LiveStreamRepository repository;

    public LiveStreamController(LiveStreamRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<LiveStream> findAll(){
        return repository.findAll();
    }

    @GetMapping ("/{id}")
    public LiveStream findById(@PathVariable String id){
        return repository.findById(id);
    }
}
