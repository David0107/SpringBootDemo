package com.hwh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwh.dao.RecognizeRecordDao;
import com.hwh.domain.RecognizeRecord;
import com.hwh.service.RecognizeRecordService;

@Service
public class RecognizeRecordServiceImpl implements RecognizeRecordService{

	@Autowired
	private RecognizeRecordDao rrd;
	
	
	@Override
	public RecognizeRecord selectByPrimaryKey(Long recognizeRecordId) {
		// TODO Auto-generated method stub
		return rrd.selectByPrimaryKey(recognizeRecordId);
	}

	
}
