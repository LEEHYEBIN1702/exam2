package com.yedam.exam;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SlipServiceImpl implements SlipService{

	@Autowired	SlipDAO dao;
	
	@Override
	public int insertSlip(List<Slip> list) {
		int i = 0;
		//테이블 입력
		for (Slip slip : list) {
			dao.insertSlip(slip);
			i++;
		}
		return i;  // 처리 건수 리턴;
	}

}
