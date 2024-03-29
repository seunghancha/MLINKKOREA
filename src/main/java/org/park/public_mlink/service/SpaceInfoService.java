package org.park.public_mlink.service;

import org.park.public_mlink.mapper.SpaceMapper;
import org.park.public_mlink.vo.SpaceInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceInfoService {

  @Autowired
  private SpaceMapper spaceMapper;

  public List<SpaceInfoVo> getSpaceInfoList(){
    return spaceMapper.getSpaceInfoList();
  }
  public void spaceInfoInsert(SpaceInfoVo spaceInfoVo){
    spaceMapper.spaceInfoInsert(spaceInfoVo);
  }
  public SpaceInfoVo spaceInfoSelect(Integer spaceNo){
    return spaceMapper.spaceInfoSelect(spaceNo);
  }


}
