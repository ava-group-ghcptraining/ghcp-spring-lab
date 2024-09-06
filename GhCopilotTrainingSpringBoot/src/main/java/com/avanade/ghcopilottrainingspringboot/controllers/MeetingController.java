package com.avanade.ghcopilottrainingspringboot.controllers;

import com.avanade.ghcopilottrainingspringboot.models.Meeting;
import com.avanade.ghcopilottrainingspringboot.repositories.MeetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/meetings")
public class MeetingController {

    @Autowired
    private MeetingRepository meetingRepository;

    @GetMapping
    public List<Meeting> getAllMeetings() {
        return meetingRepository.findAll();
    }

    @PostMapping
    public Meeting addMeeting(@RequestBody Meeting meeting) {
        return meetingRepository.save(meeting);
    }

    @PutMapping("/{id}")
    public Meeting updateMeeting(@PathVariable Long id, @RequestBody Meeting meetingDetails) {
        Optional<Meeting> optionalMeeting = meetingRepository.findById(id);
        if (optionalMeeting.isPresent()) {
            Meeting meeting = optionalMeeting.get();
            meeting.setTitle(meetingDetails.getTitle());
            meeting.setDescription(meetingDetails.getDescription());
            meeting.setDate(meetingDetails.getDate());
            return meetingRepository.save(meeting);
        } else {
            throw new RuntimeException("Meeting not found with id " + id);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteMeeting(@PathVariable Long id) {
        meetingRepository.deleteById(id);
    }
}