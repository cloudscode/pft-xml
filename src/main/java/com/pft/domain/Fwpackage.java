
/**
* Project Name:pft-xml
* File Name:Fwpackage.java
* Package Name:com.pft.test
* Date:2017年5月12日上午11:00:19
* Copyright (c) 2017, lijian@12301.cc All Rights Reserved.
*/

package com.pft.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;

/**
 * ClassName:Fwpackage <br/>
 * Reason: TODO <br/>
 * Date: 2017年5月12日 上午11:00:19 <br/>
 * 
 * @author lijian@12301.cc
 * @version V0.1
 * @since JDK 1.8
 * @see
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "fwpackage")
public class Fwpackage {

	@XmlElement(name = "jsnr")
	private Jsnr jsnr;
	@XmlCDATA
	private String ywnr;

	public Jsnr getJsnr() {
		return jsnr;
	}

	public void setJsnr(Jsnr jsnr) {
		this.jsnr = jsnr;
	}

	public String getYwnr() {
		return ywnr;
	}

	public void setYwnr(String ywnr) {
		this.ywnr = ywnr;
	}

}
