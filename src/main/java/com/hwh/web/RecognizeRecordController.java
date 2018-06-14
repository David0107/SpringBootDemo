package com.hwh.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hwh.domain.RecognizeRecord;
import com.hwh.service.RecognizeRecordService;

@RestController
@RequestMapping(value = "/recognize")
public class RecognizeRecordController {

	@Autowired
	private RecognizeRecordService rrs;

	@ResponseBody
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public RecognizeRecord get(Long recognizeRecordId) {
		if (!ObjectUtils.isEmpty(recognizeRecordId)) {
			RecognizeRecord rr = rrs.selectByPrimaryKey(recognizeRecordId);
			System.out.println("rr:" + rr);
			return rr;
		}
		System.out.println("recognizeRecordId is null");
		return null;
	}

}