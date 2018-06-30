package cn.gov.pbc.java.concurrency.detect;

/**
 * 探测工具类
 * @author renqingbin
 *
 */
public class DetectUtil {
	public static Object[][] detect(){
		System.out.println("------------探测程序执行中----------");
		  Object[][] playerInfo =
			  {
			    { "chl1", "Runing"},
			    { "chl2", "Retry"}, 
			  };
		return playerInfo;
	}
}
