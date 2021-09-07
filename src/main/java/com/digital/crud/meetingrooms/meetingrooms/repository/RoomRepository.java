package com.digital.crud.meetingrooms.meetingrooms.repository;

import com.digital.crud.meetingrooms.meetingrooms.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository <Room, Long> {
}
