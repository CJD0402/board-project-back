package com.jedong.board.dto.response.board;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.jedong.board.common.response.ResponseCode;
import com.jedong.board.common.response.ResponseMessage;
import com.jedong.board.dto.response.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostBoardResponseDto extends ResponseDto {

  private PostBoardResponseDto (String code, String Message) {
    super(code, Message);
  }

  public static ResponseEntity<PostBoardResponseDto> success() {
     PostBoardResponseDto result = new PostBoardResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
    return ResponseEntity.status(HttpStatus.OK).body(result);
  }

  public static ResponseEntity<ResponseDto> noExistedUser() {
    ResponseDto result = new ResponseDto(ResponseCode.NO_EXISTED_USER, ResponseMessage.NO_EXISTED_USER);
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
  }

}