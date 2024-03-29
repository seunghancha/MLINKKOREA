package org.park.public_mlink.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.park.public_mlink.service.CommonCodeService;
import org.park.public_mlink.vo.CommonCodeVo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class CommonCodeController {

  private final CommonCodeService commonCodeService;
  
  // 주차장정보
  @GetMapping(value = "/common/spaceInfoList")
  public List<CommonCodeVo> getCommonCodeSpaceList(){
    List<CommonCodeVo> CommonCodeList = commonCodeService.getCommonCodeSpaceList();
    log.info("common_spaceInfoList : "+CommonCodeList);
    return CommonCodeList;
  }

  // 사용자정보
  @GetMapping(value = "/common/userInfoList")
  public List<CommonCodeVo> getCommonCodeUserList(){
    List<CommonCodeVo> CommonCodeUserList = commonCodeService.getCommonCodeUserList();
    log.info("common_userInfoList : "+CommonCodeUserList);
    return CommonCodeUserList;
  }

  //할인정보
  @GetMapping(value = "/common/discInfoList")
  public List<CommonCodeVo> getCommonCodeDiscList(){
    List<CommonCodeVo> CommonCodeDiscList = commonCodeService.getCommonCodeDiscList();
    log.info("common_discInfoList : "+CommonCodeDiscList);
    return CommonCodeDiscList;
  }

}
