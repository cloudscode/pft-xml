
/**
* Project Name:pft-xml
* File Name:Jsnr.java
* Package Name:com.pft.test
* Date:2017年5月12日上午11:00:31
* Copyright (c) 2017, lijian@12301.cc All Rights Reserved.
*/

package com.pft.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ClassName:Jsnr <br/>
 * Reason: TODO <br/>
 * Date: 2017年5月12日 上午11:00:31 <br/>
 * 
 * @author lijian@12301.cc
 * @version V0.1
 * @since JDK 1.8
 * @see
 */
@XmlAccessorType(XmlAccessType.FIELD)  
@XmlRootElement(name = "jsnr")  
public class Jsnr {
	
	@XmlElement(name = "fwdm")
	private int fwdm;
	private String nsrsbh;
	private String jrdm;

	public int getFwdm() {
		return fwdm;
	}

	public void setFwdm(int fwdm) {
		this.fwdm = fwdm;
	}

	public String getNsrsbh() {
		return nsrsbh;
	}

	public void setNsrsbh(String nsrsbh) {
		this.nsrsbh = nsrsbh;
	}

	public String getJrdm() {
		return jrdm;
	}

	public void setJrdm(String jrdm) {
		this.jrdm = jrdm;
	}

}
