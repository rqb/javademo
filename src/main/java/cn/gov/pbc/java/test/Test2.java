package cn.gov.pbc.java.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {
	
	/**
	 * 1,work1,{[2015-12-01,0.4f],[2015-12-01,0.5f],[2015-12-02,0.8f]},  {[2015-12-01,0.45f],[2015-12-02,0.8f]}
	 * 2,work2,{[2015-12-02,0.5f],[2015-12-02,0.4f],[2015-12-02,0.3f],[2015-12-03,0.2f]},  {[2015-12-02,0.4f],[2015-12-03,0.2f]}
	 * 3,work3,{[2015-12-01,0.1f],[2015-12-03,0.4f]},  {[2015-12-01,0.1f],[2015-12-03,0.4f]}
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<WorkSeqenceDto> listdto = createdtoList();
		
		List reportdtolist = new ArrayList();
		
		WorkSeqenceReportDto reportdto = new WorkSeqenceReportDto();
		Map<String,ArrayList> map = new HashMap<String,ArrayList>();
		
		for(int i=0; i<listdto.size();i++){
			WorkSeqenceDto dto = listdto.get(i);
			
			if(map.containsKey(dto.getWorkid()+"|"+dto.getDate())){
				ArrayList list = map.get(dto.getWorkid()+"|"+dto.getDate());
				list.add(dto.getTime());
				map.put(dto.getWorkid()+"|"+dto.getDate(), list);
			}else{
				ArrayList list = new ArrayList();
			    list.add(dto.getTime());
				map.put(dto.getWorkid()+"|"+dto.getDate(), list);
			}
			
		}

		System.out.println(map);
	}
	
	
	
	public static List<WorkSeqenceDto> createdtoList(){
		SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd");
		List<WorkSeqenceDto> listdto = new ArrayList<WorkSeqenceDto>();
		
		Date date20151201 = null;
		Date date20151202 = null;
		Date date20151203 = null;
		try {
			date20151201 = sdf.parse("2015-12-01");
			date20151202 = sdf.parse("2015-12-02");
			date20151203 = sdf.parse("2015-12-03");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		WorkSeqenceDto dto = new WorkSeqenceDto();
		dto.setWorkid("1");
		dto.setWorkname("work1");
		dto.setDate(date20151201);
		dto.setTime(0.4f);
		listdto.add(dto);
		
		dto = new WorkSeqenceDto();
		dto.setWorkid("1");
		dto.setWorkname("work1");
		dto.setDate(date20151201);
		dto.setTime(0.5f);
		listdto.add(dto);

		dto = new WorkSeqenceDto();
		dto.setWorkid("1");
		dto.setWorkname("work1");
		dto.setDate(date20151202);
		dto.setTime(0.8f);
		listdto.add(dto);

		dto = new WorkSeqenceDto();
		dto.setWorkid("2");
		dto.setWorkname("work2");
		dto.setDate(date20151202);
		dto.setTime(0.5f);
		listdto.add(dto);

		dto = new WorkSeqenceDto();
		dto.setWorkid("2");
		dto.setWorkname("work2");
		dto.setDate(date20151202);
		dto.setTime(0.4f);
		listdto.add(dto);

		dto = new WorkSeqenceDto();
		dto.setWorkid("2");
		dto.setWorkname("work2");
		dto.setDate(date20151202);
		dto.setTime(0.3f);
		listdto.add(dto);

		dto = new WorkSeqenceDto();
		dto.setWorkid("2");
		dto.setWorkname("work2");
		dto.setDate(date20151203);
		dto.setTime(0.2f);
		listdto.add(dto);

		dto = new WorkSeqenceDto();
		dto.setWorkid("3");
		dto.setWorkname("work3");
		dto.setDate(date20151201);
		dto.setTime(0.1f);
		listdto.add(dto);
		
		dto = new WorkSeqenceDto();
		dto.setWorkid("3");
		dto.setWorkname("work3");
		dto.setDate(date20151203);
		dto.setTime(0.4f);
		listdto.add(dto);
		
		return listdto;
	}
}
