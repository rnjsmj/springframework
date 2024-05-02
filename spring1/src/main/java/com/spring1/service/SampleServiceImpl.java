package com.spring1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring1.dao.SampleDAO;
import com.spring1.dto.Sample;

public class SampleServiceImpl implements SampleService{
	
	@Autowired
	private SampleDAO sampleDAO;

	@Override
	public List<Sample> getSampleList() {
		
		return sampleDAO.getSampleList();
	}

	@Override
	public Sample getSample(int num) {
		
		return sampleDAO.getSample(num);
	}

	@Override
	public void insSample(Sample sample) {
		sampleDAO.insSample(sample);
		
	}

	@Override
	public void updSample(Sample sample) {
		sampleDAO.updSample(sample);
		
	}

	@Override
	public void delSample(Sample sample) {
		sampleDAO.delSample(sample);
		
	}
	
}
