package cn.com.wito.auth.service.mgr.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import cn.com.wito.auth.dto.ClientStatus;

import com.alibaba.fastjson.JSON;

public class Demo {

	private String host = "101.200.197.118";

	private String port = "9900";

	private String cmdKey = "series2-";

	public ClientStatus machineStatus(String seriesNum) {
		Socket socket = null;
		InputStream in = null;
		OutputStream out = null;
		StringBuffer sb = new StringBuffer();
		try {
			socket = new Socket(host, Integer.parseInt(port));
			in = socket.getInputStream();
			out = socket.getOutputStream();
			String cmd = cmdKey + seriesNum;
			out.write(cmd.getBytes());
			out.write(3);
			out.flush();
			int ch = -1;
			while (true) {
				try {
					ch = in.read();
				} catch (Exception e) {
					ch = -1;
				}
				if (ch < 0) {
					break;
				}
				sb.append((char) ch);
			}

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
				if (socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String result = sb.toString();
		ClientStatus cs = null;
		try {
			cs = JSON.parseObject(result, ClientStatus.class);
		} catch (Exception e) {
			
		}
		return cs;
	}

	public int getMachinestate(String seriesNum)throws Exception{
		int machineState = 0;
		Demo dm=new Demo();
		ClientStatus st=new ClientStatus();
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", java.util.Locale.US);
		try {
			st=dm.machineStatus(seriesNum);//调用接口
			if(st!=null){
				String times=(st.getLastTickTime().toString())==null?"":(st.getLastTickTime().toString());
				System.out.print("返回结果："+st);
				Date date = sdf.parse(times);//将取到的时间转为date类型
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	//			Date date1 = df.parse(st.getLastTickTime().toString());
				
				Date now=df.parse(df.format(new Date()));
				long l=now.getTime()-date.getTime();
				long s=(l/1000); 
				
				if(s<180){
					machineState=1;
					System.out.print("售药机状态：网络正常");
				}else{
					machineState=-1;
					System.out.print("售药机状态：网络异常");
				}
				System.out.println("；捕获延迟时间："+s+"秒");
			}else{
				System.out.print("机器编码不正确");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return machineState;
	}
	public static void main(String[] args) throws Exception  {
	
//	int a=getMachinestate("0123456789");
//	System.out.println("；捕获状态："+a);
		
	}
}
