package com.hwh.dao;


import com.hwh.domain.RecognizeRecord;


public interface RecognizeRecordDao {

    RecognizeRecord selectByPrimaryKey(Long recognizeRecordId);
    
}