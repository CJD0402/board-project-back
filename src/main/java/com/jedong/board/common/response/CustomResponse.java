package com.jedong.board.common.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public interface CustomResponse {
  public static final ResponseEntity<?> serviceunavailable = 
    ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(null);
}
