package com.digital.crud.meetingrooms.meetingrooms.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
    private Date timeStamp;
    private String message;
    private String details;
}
