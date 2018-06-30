package cn.gov.pbc.java.loadbalance;

import java.util.HashMap;

public class ChannelMap {
	private static HashMap<String,String>  chlQueueMap= new HashMap<String,String>();
	
	static{
		chlQueueMap.put("TIPS"+LoadBalanceConstant.CUR_CENTER+".O1", "q1");
		chlQueueMap.put("TIPS"+LoadBalanceConstant.CUR_CENTER+".O2", "q2");
		chlQueueMap.put("TIPS"+LoadBalanceConstant.CUR_CENTER+".B1", "q3");
		chlQueueMap.put("TIPS"+LoadBalanceConstant.CUR_CENTER+".B2", "q4");
		chlQueueMap.put("TIPS"+LoadBalanceConstant.CUR_CENTER+".N1", "q5");
		chlQueueMap.put("TIPS"+LoadBalanceConstant.CUR_CENTER+".N2", "q6");
	}
}
