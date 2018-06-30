package cn.gov.pbc.java.loadbalance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LoadBalance {
	
	private static List<String> onlineChlList = Arrays.asList("TIPS"+LoadBalanceConstant.CUR_CENTER+".O1","TIPS"+LoadBalanceConstant.CUR_CENTER+".O2");
	
	private static List<String> batchChlList  = Arrays.asList("TIPS"+LoadBalanceConstant.CUR_CENTER+".B1","TIPS"+LoadBalanceConstant.CUR_CENTER+".B2");
	
	private static List<String> normalChlList = Arrays.asList("TIPS"+LoadBalanceConstant.CUR_CENTER+".N1","TIPS"+LoadBalanceConstant.CUR_CENTER+".N2");
	
	private static HashMap<String,String>  chlQueueMap= new HashMap<String,String>();
	
	static{
		chlQueueMap.put("TIPS"+LoadBalanceConstant.CUR_CENTER+".O1", "q1");
		chlQueueMap.put("TIPS"+LoadBalanceConstant.CUR_CENTER+".O2", "q2");
		chlQueueMap.put("TIPS"+LoadBalanceConstant.CUR_CENTER+".B1", "q3");
		chlQueueMap.put("TIPS"+LoadBalanceConstant.CUR_CENTER+".B2", "q4");
		chlQueueMap.put("TIPS"+LoadBalanceConstant.CUR_CENTER+".N1", "q5");
		chlQueueMap.put("TIPS"+LoadBalanceConstant.CUR_CENTER+".N2", "q6");
	}
	
	public static String getQueue(){
		
		ArrayList<String> runchlList = getRunChlList();
		
		java.util.Random random = new java.util.Random();
		int randomPos = random.nextInt(runchlList.size());
		
		return chlQueueMap.get(runchlList.get(randomPos));
		
	}

	public static void main(String[] args) {
		
		for(int i=0 ; i<100; i++){
			System.out.println(getQueue());
		}
	}
	
	private static boolean getchlStatus(String chlname){
		return true;
	}
	
	
	private static ArrayList<String> getRunChlList(){
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<onlineChlList.size(); i++){
			if(getchlStatus(onlineChlList.get(i))){
				list.add(onlineChlList.get(i));   
			}
		}
		return list;
	}

}
