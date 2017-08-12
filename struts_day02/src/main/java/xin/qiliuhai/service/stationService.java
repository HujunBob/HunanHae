package xin.qiliuhai.service;

import java.util.List;

import xin.qiliuhai.domain.stationInfo;

public interface stationService {
	public List<stationInfo> getAll(String riverId);
}
