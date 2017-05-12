
/**
* Project Name:pft-xml
* File Name:XmlUtilsTest.java
* Package Name:com.pft.xml
* Date:2017年5月12日下午3:03:21
* Copyright (c) 2017, lijian@12301.cc All Rights Reserved.
*/

package com.pft.xml;

import org.junit.Test;

import com.pft.domain.BWRequest;
import com.pft.domain.Fwpackage;
import com.pft.domain.Jsnr;
import com.pft.domain.Ywnr;
import com.pft.util.XmlUtils;

/**
 * ClassName:XmlUtilsTest <br/>
 * Reason: TODO <br/>
 * Date: 2017年5月12日 下午3:03:21 <br/>
 * 
 * @author lijian@12301.cc
 * @version V0.1
 * @since JDK 1.8
 * @see
 */
public class XmlUtilsTest {
	@Test
	public void convertToXml() {

		BWRequest bwRequest = new BWRequest();
		bwRequest.setNsrsbh("纳税人识别号");
		bwRequest.setJgbh("机器编号");
		bwRequest.setKpdzbm("开票终端代码");
		bwRequest.setFplxdm("发票类型代码");

		Jsnr jsnr = new Jsnr();
		jsnr.setFwdm(1013);
		jsnr.setNsrsbh("纳税人识别号");
		jsnr.setJrdm("接入代码");

		Ywnr ywnr = new Ywnr();
		ywnr.setRequest(bwRequest);

		String ywnrxml = XmlUtils.convertToXml(ywnr,"UTF-8");
		Fwpackage fwpackage = new Fwpackage();
		fwpackage.setJsnr(jsnr);
		fwpackage.setYwnr(ywnrxml);
		//fwpackage.setYwnr(ywnr);

		String xml = XmlUtils.convertToXml(fwpackage, "UTF-8");
		System.out.println("-------------------------------------");
		System.out.println(xml);
	
	}
	@Test
	public void convertToJavaBean(){
		StringBuilder sb=new StringBuilder();
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		sb.append("<fwpackage>");
			sb.append("<jsnr>");
				sb.append("<fwdm>1013</fwdm>");
				sb.append("<nsrsbh>纳税人识别号</nsrsbh>");
				sb.append("<jrdm>接入代码</jrdm>");
			sb.append(" </jsnr>");
			sb.append("<ywnr>");
				sb.append("<![CDATA[<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
					sb.append("<request>");
						sb.append("<nsrsbh>纳税人识别号</nsrsbh>");
						sb.append("<jgbh>机器编号</jgbh>");
					sb.append("</request>");
				sb.append("]]>");
			sb.append("</ywnr>");
		sb.append("</fwpackage>");
		
		Fwpackage fwpackage = XmlUtils.convertToJavaBean(sb.toString(), Fwpackage.class);
		System.out.println("fwdm = "+fwpackage.getJsnr().getFwdm());
		System.out.println("nsrsbh = "+fwpackage.getJsnr().getNsrsbh());
		System.out.println("ywnr = "+fwpackage.getYwnr());
		BWRequest request = XmlUtils.convertToJavaBean(fwpackage.getYwnr(), BWRequest.class);
		System.out.println("nsrsbh = "+request.getNsrsbh());
		System.out.println("jgbh = "+request.getJgbh());
	}
}
