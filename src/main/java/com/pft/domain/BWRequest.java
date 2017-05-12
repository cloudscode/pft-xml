
/**
* Project Name:pft-xml
* File Name:BWRequest.java
* Package Name:com.pft.test
* Date:2017年5月12日上午11:01:00
* Copyright (c) 2017, lijian@12301.cc All Rights Reserved.
*/

package com.pft.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ClassName:BWRequest <br/>
 * Reason: TODO <br/>
 * Date: 2017年5月12日 上午11:01:00 <br/>
 * 
 * @author lijian@12301.cc
 * @version V0.1
 * @since JDK 1.8
 * @see
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "request")  
public class BWRequest {
	@XmlElement(name = "nsrsbh")
	private String nsrsbh;
	//@XmlCDATA
	private String jgbh;

	private String kpdzbm;

	private String fplxdm;

	public String getNsrsbh() {
		return nsrsbh;
	}

	public void setNsrsbh(String nsrsbh) {
		this.nsrsbh = nsrsbh;
	}

	public String getJgbh() {
		return jgbh;
	}

	public void setJgbh(String jgbh) {
		this.jgbh = jgbh;
	}

	public String getKpdzbm() {
		return kpdzbm;
	}

	public void setKpdzbm(String kpdzbm) {
		this.kpdzbm = kpdzbm;
	}

	public String getFplxdm() {
		return fplxdm;
	}

	public void setFplxdm(String fplxdm) {
		this.fplxdm = fplxdm;
	}
}
